package com.baizhan.Transaction;

import com.baizhan.account.JDBCutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {
    public static void main(String[] args) throws SQLException {
        //实现zhangsan向lisi转账500
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCutil.getConnection();
            //关闭自动提交，开启事务
            conn.setAutoCommit(false);
            String sql = "update baizhan.bank set balance=balance+? where username=?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, 500);
            ps.setObject(2, "lisi");
            ps.executeUpdate();
            ps.setObject(1, -500);
            ps.setObject(2, "zhangsan");
            ps.executeUpdate();
            //假设异常
            int a = 1 / 0;
            //如果没出错，提交事务
            conn.commit();
        } catch (Exception e) {
            //如果出错，回滚事务
            conn.rollback();
            e.printStackTrace();
        } finally {
            JDBCutil.close(conn, ps);
        }
    }

}
