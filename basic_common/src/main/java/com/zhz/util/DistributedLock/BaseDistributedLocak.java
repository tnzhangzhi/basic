package com.zhz.util.DistributedLock;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by zz1987 on 17/7/24.
 */
public class BaseDistributedLocak {
    private final ZkClient client;
    private final String path;
    private final String basePath;
    private final String lockName;
    private static final Integer MAX_RETRY_COUNT = 10;

    public BaseDistributedLocak(ZkClient client,String basePath,String lockName){
        this.client = client;
        this.basePath = basePath;
        this.path = basePath.concat("/").concat(lockName);
        this.lockName = lockName;
    }

    private void deletePath(String path){
        client.delete(path);
    }

    private String createLockNode(String path){
        return client.createEphemeralSequential(path,null);
    }

    private boolean getLock(Long startMillis,Long millisToWait,String path) throws InterruptedException {
        boolean isOwn =false;
        boolean doDelete = false;
        System.out.println("尝试获取节点《"+path+"》的锁");
        try {
            while (!isOwn) {
                List<String> children = getSortedChildren();
                String seqNodeName = path.substring(basePath.length() + 1);
                int seq = children.indexOf(seqNodeName);

                if (seq < 0) {
                    System.out.println("节点没找到：" + seqNodeName);
                }

                isOwn = seq == 0;

                String pathToWatch = isOwn ? null : children.get(seq - 1);

                if (!isOwn) {
                    System.out.println("获取节点"+path+"锁阻塞");
                    String preSeqPath = basePath.concat("/").concat(pathToWatch);
                    final CountDownLatch latch = new CountDownLatch(1);
                    final IZkDataListener preListener = new IZkDataListener() {
                        public void handleDataChange(String s, Object o) throws Exception {
                            //ignore
                        }

                        public void handleDataDeleted(String s) throws Exception {
                            latch.countDown();
                        }
                    };
                    try {
                        client.subscribeDataChanges(preSeqPath, preListener);
                        if (millisToWait != null) {
                            millisToWait -= (System.currentTimeMillis() - startMillis);
                            startMillis = System.currentTimeMillis();
                            if (millisToWait <= 0) {
                                doDelete = true;
                                System.out.println("获取"+path+"锁超时。。。");
                                break;
                            }
                            latch.await(millisToWait, TimeUnit.MINUTES);
                        } else {
                            latch.await();
                        }
                    } finally {
                        client.unsubscribeDataChanges(preSeqPath, preListener);
                    }
                }else{
                    System.out.println("获取到节点"+path);
                }

            }
        }finally {
            if(doDelete){
                deletePath(path);
            }
        }
        return isOwn;
    }

    private List<String> getSortedChildren(){
        List<String> children =  client.getChildren(basePath);
        Collections.sort(children, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return getLockNodeNumber(o1,lockName).compareTo(getLockNodeNumber(o2,lockName));
            }
        });
        return children;
    }

    private String getLockNodeNumber(String str,String lockName){
        int index = str.lastIndexOf(lockName);
        if(index >= 0){
            index += lockName.length();
            return index <= str.length()?str.substring(index) : "";
        }
        return str;
    }

    protected void releaseLock(String locakPath){
        if(locakPath!=null) {
            if (client.exists(locakPath)) {
                deletePath(locakPath);
            }
        }
    }

    protected String attemptLock(long time, TimeUnit unit){
        final Long startMillis = System.currentTimeMillis();
        final Long millisToWait = (unit == null) ? null :unit.toMillis(time) ;
        String opath = null;
        boolean hasLock =false;
        boolean isDone = false;
        int retryCount = 0;

        while(!isDone){
            isDone = true;
            try {
                opath = createLockNode(path);
                hasLock = getLock(startMillis, millisToWait, opath);
            }catch (Exception e){
                if(retryCount++ < MAX_RETRY_COUNT){
                    isDone = false;
                }
            }
        }
        if(hasLock){
            return opath;
        }
        return null;
    }


}
