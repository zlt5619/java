package com.baizhan.Pool;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;

public class TestDBCP {
    public static void main(String[] args) throws Exception {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/baizhan");
        source.setUsername("root");
        source.setPassword("123456");
        //初始化数据库连接池
        source.setInitialSize(10);
        //获取数据库连接
        Connection conn = source.getConnection();
        System.out.println(conn);
    }
}
