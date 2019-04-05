package com.example.democoncurrentclient.Test;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * @author poldi.chen
 * @className ClientThread
 * @description TODO
 * @date 2019/4/5 14:04
 **/
public class ClientThread implements Runnable {

    public void run() {

        try {
            Thread.sleep((int) Math.random()*1000*10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();
        String url = "http://localhost:8080/buy/" + threadName;

        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate template = builder.build();
        int result = template.getForObject(url, Integer.class);
        System.out.println(threadName + " " + result);

    }

}
