package com.baizhan.Blob;

import com.baizhan.account.JDBCutil;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestReadBlob {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCutil.getConnection();
        String sql = "select * from baizhan.movieactor where photo!=''";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("actorname");
            Blob blob = rs.getBlob("photo");
            InputStream is = blob.getBinaryStream();
            FileOutputStream fos = new FileOutputStream(id + "_" + name + ".jpg");
            byte[] Buffer = new byte[1024];
            int len;
            while ((len = is.read(Buffer)) != -1) {
                fos.write(Buffer, 0, len);
            }
            is.close();
            fos.close();
        }
        JDBCutil.close(conn, ps);
    }
}
