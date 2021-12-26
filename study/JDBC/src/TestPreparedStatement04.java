import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TestPreparedStatement04 {
    public static void main(String[] args) throws Exception {
        String sql = "select * from baizhan.user1";
        query(sql);


    }

    public static void query(String sql, Object... args) throws Exception {
        Connection conn = JDBCutil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);  //小心参数声明错误
        }
        ResultSet rs = ps.executeQuery();
        //获取结果集元数据
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        //获取列数
        int column_num = resultSetMetaData.getColumnCount();
        //打印数据
        while (rs.next()) {
            for (int i = 0; i < column_num; i++) {
                System.out.print(rs.getObject(i + 1) + " ");
            }
            System.out.println();
        }
        JDBCutil.close(conn, ps);
    }
}
