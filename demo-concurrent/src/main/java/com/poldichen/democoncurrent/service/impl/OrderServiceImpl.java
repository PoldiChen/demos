package com.poldichen.democoncurrent.service.impl;

import com.poldichen.democoncurrent.dao.IOrderDao;
import com.poldichen.democoncurrent.service.inter.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author poldi.chen
 * @className OrderServiceImpl
 * @description TODO
 * @date 2019/4/5 14:23
 **/
@Component
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao orderDao;

    public int createOneOrder(String goodsName, String userName) {
        int result = orderDao.createOneOrder(goodsName, userName);
        return result;
    }

}
