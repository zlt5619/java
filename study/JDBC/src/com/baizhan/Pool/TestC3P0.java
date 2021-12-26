package com.baizhan.Pool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import java.sql.Connection;

public class TestC3P0 {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/baizhan");
        cpds.setUser("root");
        cpds.setPassword("123456");
        //设置初始化时，数据库连接池的连接,设置10个连接
        cpds.setInitialPoolSize(10);
        //获取连接
        Connection conn = cpds.getConnection();
        System.out.println(conn);
        //销毁连接池
        DataSources.destroy(cpds);

    }
}
