package com.zhz.util.DistributedLock.test;

import com.zhz.util.DistributedLock.SimpleDistributedLockMutex;
import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.TimeUnit;

/**
 * Created by zz1987 on 17/7/24.
 */
public class TestDistributedLock {

    public static void main(String[] args) {
        final ZkClient client = new ZkClient("127.0.0.1:2181");
        if(!client.exists("/distributed_lock")) {
            client.createPersistent("/distributed_lock");
        }
        final SimpleDistributedLockMutex lockMutex = new SimpleDistributedLockMutex(client,"/distributed_lock");

        for(int i=0;i<10;i++){
            new Thread("thread-name-"+i){
                @Override
                public void run() {
                    try {
                        lockMutex.acquire(3, TimeUnit.MILLISECONDS);
                        sleep(5000);
                        lockMutex.release();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
