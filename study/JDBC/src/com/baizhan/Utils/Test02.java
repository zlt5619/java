package com.baizhan.Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args) throws Exception {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(is);
        //通过数据库连接池初始化QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(DruidDataSourceFactory.createDataSource(properties));
        String sql = "select * from baizhan.user where id=?";
        BeanHandler<User> bh = new BeanHandler<>(User.class);
        User user = queryRunner.query(sql, bh, 3);
        System.out.println(user.toString());
        System.out.println();
        sql = "select * from baizhan.user";
        //多条记录使用BeanListHandler
        // 给BeanListHandler提供相关实体类信息
        BeanListHandler<User> bhs = new BeanListHandler<>(User.class);
        //使用实体类集合直接接收所有数据
        // query参数，分别为sql语句，ResultSetHandler对象
        List<User> users = queryRunner.query(sql, bhs);
        System.out.println(users.size());
        System.out.println();
        sql = "select count(*) from baizhan.user"; //通过ScalarHandler保存单一值
        ScalarHandler sh = new ScalarHandler();
        Long count = (Long) queryRunner.query(sql, sh);
        System.out.println(count);
    }
}
