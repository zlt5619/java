import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestORM01 {
    public static void main(String[] args) throws Exception {
        String sql = "select * from baizhan.user";
        List<User> users = queryUser(sql);
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            System.out.println(u.toString());
        }
    }

    public static List<User> queryUser(String sql, Object... args) throws Exception {
        Connection conn = JDBCutil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        int columnNum = resultSetMetaData.getColumnCount();
        while (rs.next()) {
            User u = new User();
            for (int i = 0; i < columnNum; i++) {
                //获得表里的值
                Object columnValue = rs.getObject(i + 1);
                //获得列名
                String columnName = resultSetMetaData.getColumnName(i + 1);
                //有了列名，通过反射，获取类的属性
                Field field = u.getClass().getDeclaredField(columnName);
                //设置操作权限，可以操作private属性
                field.setAccessible(true);
                //给对象的属性赋值
                field.set(u, columnValue);
            }
            users.add(u);
        }
        JDBCutil.close(conn, ps);
        return users;
    }
}
