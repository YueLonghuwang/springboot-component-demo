package com.yjx.demo.dislock.service;

/**
 * @author yejingxuan
 */
public interface DisLockService {

    /**
     * 通过redis锁处理数据
     * @return Boolean
     */
    Boolean handleDataByRedisLock();

    /**
     * 通过redisson锁处理数据
     * @return Boolean
     */
    Boolean testRedissonLock() throws InterruptedException;



    Boolean testRedissonFairLock(String key) throws InterruptedException;



    Boolean testZkLock() throws Exception;
}
