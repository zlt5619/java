package com.baizhan.Pool;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class TestDBCP02 {
    public static void main(String[] args) throws Exception {
        InputStream is = TestDBCP02.class.getClassLoader().getResourceAsStream("dbcp.properties");
        Properties properties = new Properties();
        properties.load(is);
        DataSource ds = BasicDataSourceFactory.createDataSource(properties);
        Connection connectionc = ds.getConnection();
        System.out.println(connectionc);

    }
}
