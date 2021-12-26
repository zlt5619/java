package com.baizhan.insert;

import com.baizhan.account.JDBCutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Test {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCutil.getConnection();
        Statement statement = connection.createStatement();
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String sql = "insert into baizhan.goods(goodsname) values('name_" + i + "')";
            statement.execute(sql);
        }
        Long end = System.currentTimeMillis();
        JDBCutil.close(connection, statement);
        System.out.println("spent time：" + (end - start));

    }
}
