package com.poldichen.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/test")
    public String test() {
        return "hello world";
    }

//    private void test1() {}

}
