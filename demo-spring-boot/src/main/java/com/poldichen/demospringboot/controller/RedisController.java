package com.poldichen.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@RestController
public class RedisController {

    @Autowired
    private RedisLockRegistry redisLockRegistry;

    @RequestMapping(value="/redis/lock/{myName}")
    public int redisLockTest(@PathVariable("myName") String myName) throws InterruptedException {
        Lock lock = redisLockRegistry.obtain("lock_my_name");
        boolean getLock = lock.tryLock(3, TimeUnit.SECONDS);
        System.out.println(getLock);

        TimeUnit.SECONDS.sleep(5);

        boolean getLock2 = lock.tryLock(3, TimeUnit.SECONDS);
        System.out.println(getLock2);

        lock.unlock();
        lock.unlock();

        return 1;
    }

}
