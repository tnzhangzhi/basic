package com.zhz.util.DistributedLock;

import java.util.concurrent.TimeUnit;

/**
 * Created by zz1987 on 17/7/24.
 */
public interface DistribudedLock {

    //获取锁，没有获取到阻塞等待
    public void acquire();

    //获取锁，直到超时
    public boolean acquire(long time, TimeUnit unit);

    //释放锁
    public void release();
}
