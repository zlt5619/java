package com.baizhan.Blob;

import com.baizhan.account.JDBCutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestBlob {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCutil.getConnection();
        String sql = "insert into baizhan.movieactor (actorname,photo) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "朱茵");
        InputStream is = new FileInputStream(new File("D:\\programming\\java\\study\\JDBC\\jpg\\zhuyin.jpg"));
        ps.setBlob(2, is);
        ps.executeUpdate();
        JDBCutil.close(conn, ps);

    }
}
