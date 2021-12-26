package com.baizhan.insert;

import com.baizhan.account.JDBCutil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert_Test03 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCutil.getConnection();
        String sql = "insert into goods(goodsname)values(?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ps.setObject(1, "name-" + i);
            //缓存sql
            ps.addBatch();
            //每500条缓存执行一次
            if (i % 500 == 0) {
                ps.executeBatch();
                ps.clearBatch();
            }

        }
        Long end = System.currentTimeMillis();
        JDBCutil.close(connection, ps);
        System.out.println("spent time：" + (end - start));

    }
}
