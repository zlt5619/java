package com.baizhan.Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class Test03 {
    public static void main(String[] args) throws Exception {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(is);
        //通过数据库连接池初始化QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(DruidDataSourceFactory.createDataSource(properties));

        String sql = "select * from baizhan.user where id=?";
        MyHandler mh = new MyHandler();
        Map<String, String> map = (Map<String, String>) queryRunner.query(sql, mh, 3);
        System.out.println(map);

    }
}
