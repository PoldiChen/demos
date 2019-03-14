package com.poldichen.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.poldichen.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

public class Test {

    public static void main(String[] args) {
        // 配置文件路径
        String configPath = "com/poldichen/resource/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            // 读取配置文件
            inputStream = Resources.getResourceAsStream(configPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<User> list = sqlSession.selectList("listUserInfo");
            for (User user: list) {
                System.out.println(user.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
