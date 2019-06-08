package com.poldichen.demospringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@RestController
public class RedisController {

    @Autowired
    private RedisLockRegistry redisLockRegistry;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value="/redis/my_name")
    public String getMyName() {
        String myName = stringRedisTemplate.opsForValue().get("my_name");
        return myName;
    }

    @RequestMapping(value = "/redis/my_name", method = RequestMethod.POST)
    public String setMyName(@RequestBody String params) {
        JSONObject jsonObject = JSON.parseObject(params);
        String newName = (String) jsonObject.get("my_name");
        stringRedisTemplate.opsForValue().set("my_name", newName);
        return "done";
    }

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
