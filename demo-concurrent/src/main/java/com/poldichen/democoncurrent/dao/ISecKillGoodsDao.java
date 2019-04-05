package com.poldichen.democoncurrent.dao;

import org.apache.ibatis.annotations.Param;

public interface ISecKillGoodsDao {

    int buy(@Param("userName") String userName);

}
