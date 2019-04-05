package com.poldichen.democoncurrent.controller;

import com.poldichen.democoncurrent.service.inter.IOrderService;
import com.poldichen.democoncurrent.service.inter.ISecKillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author poldi.chen
 * @className SecKillGoodsController
 * @description TODO
 * @date 2019/4/5 11:32
 **/
@RestController
public class SecKillGoodsController {

    @Autowired
    private ISecKillGoodsService secKillGoodsService;

    @Autowired
    private IOrderService orderService;

    @RequestMapping(value="/buy/{userName}")
    public int buy(@PathVariable("userName") String userName) {
        int result = secKillGoodsService.buy(userName);
        if (result > 0) {
            orderService.createOneOrder("product1", userName);
        }
        return result;
    }
}
