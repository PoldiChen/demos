package com.poldichen.demospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/6/7 13:05
 **/
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext();
    }
}
