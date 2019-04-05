package com.poldichen.democoncurrent.service.impl;

import com.poldichen.democoncurrent.dao.ISecKillGoodsDao;
import com.poldichen.democoncurrent.service.inter.ISecKillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author poldi.chen
 * @className SecKillGoodsServiceImpl
 * @description TODO
 * @date 2019/4/5 11:31
 **/
@Component
public class SecKillGoodsServiceImpl implements ISecKillGoodsService {

    @Autowired
    private ISecKillGoodsDao secKillGoodsDao;

    @Override
    public int buy(String userName) {
        return secKillGoodsDao.buy(userName);
    }

}
