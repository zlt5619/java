import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestPreparedStatement03 {
    public static void main(String[] args) throws Exception {
        String sql = "delete from baizhan.user1 where username = ? ";
        update(sql, "admin6");

    }

    public static void update(String sql, Object... args) throws Exception {
        Connection conn = JDBCutil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);  //小心参数声明错误
        }
        ps.executeUpdate();
        JDBCutil.close(conn, ps);
    }
}
