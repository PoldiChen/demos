package com.example.democoncurrentclient.Test;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/4/5 13:53
 **/
public class Test {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i=0; i<10; i++) {
            ClientThread clientThread = new ClientThread();
//            Thread thread = new Thread(clientThread, "name");
            service.execute(clientThread);
        }
        service.shutdown();

    }

}
