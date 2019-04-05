package com.poldichen.democoncurrent.service.inter;

import org.springframework.stereotype.Component;

public interface IOrderService {

    int createOneOrder(String goodsName, String userName);

}
