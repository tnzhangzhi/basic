package com.zhz.util.DistributedLock;

import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.TimeUnit;

/**
 * Created by zz1987 on 17/7/24.
 */
public class SimpleDistributedLockMutex extends BaseDistributedLocak implements DistribudedLock {

    private final String basePath;
    private static final String LOCK_NAME = "lock-";
    private String ourLockPath;

    public SimpleDistributedLockMutex(ZkClient client,String basePath){
        super(client,basePath,LOCK_NAME);
        this.basePath = basePath;
    }

    private boolean internalLock(long time,TimeUnit unit){
        ourLockPath = attemptLock(time,unit);
        return ourLockPath != null;
    }


    public void acquire() {
        if(!internalLock(-1,null)){
            System.out.println("链接丢失！在路径："+basePath+"下不能获取锁");
        }
    }

    public boolean acquire(long time, TimeUnit unit) {
        return internalLock(time,unit);
    }

    public void release() {
        releaseLock(ourLockPath);
    }
}
