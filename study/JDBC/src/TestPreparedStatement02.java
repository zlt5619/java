import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class TestPreparedStatement02 {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCutil.getConnection();

        String sql = "update baizhan.user1 set password=? where username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        //setString方法会自动给参数携带引号
        ps.setString(1, "aaaaa");
        ps.setString(2, "zlt");
        ps.executeUpdate();

        JDBCutil.close(conn, ps);
    }
}
