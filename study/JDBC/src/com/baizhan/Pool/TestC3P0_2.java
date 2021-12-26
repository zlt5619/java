package com.baizhan.Pool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class TestC3P0_2 {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        Connection conn = cpds.getConnection();
        System.out.println(conn);
    }
}
