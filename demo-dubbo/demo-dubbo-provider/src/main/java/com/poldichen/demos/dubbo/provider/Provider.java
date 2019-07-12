package com.poldichen.demos.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * @author poldi.chen
 * @className Provider
 * @description TODO
 * @date 2019/7/12 11:13
 **/
public class Provider {

    public static void main(String[] args) throws IOException {
        System.out.println("main...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
