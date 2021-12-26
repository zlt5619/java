package com.baizhan.Pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class TestDruid {
    public static void main(String[] args) throws Exception {
        InputStream is = TestDBCP02.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
