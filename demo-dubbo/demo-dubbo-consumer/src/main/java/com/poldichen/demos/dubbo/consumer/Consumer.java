package com.poldichen.demos.dubbo.consumer;

import com.poldichen.demos.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author poldi.chen
 * @className Consumer
 * @description TODO
 * @date 2019/7/12 10:50
 **/
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1));
    }
}
