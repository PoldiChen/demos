package com.poldichen.democoncurrent.dao;

import org.apache.ibatis.annotations.Param;

public interface IOrderDao {

    int createOneOrder(@Param("goodsName") String goodsName, @Param("userName") String userName);

}
