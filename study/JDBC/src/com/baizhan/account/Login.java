package com.baizhan.account;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

public class Login {
    public static void main(String[] args) throws Exception {
        Map<String, String> userLoginInfo = initUI();
        System.out.println(login(userLoginInfo) ? "登录成功" : "登录失败");

    }

    public static Map<String, String> initUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter account");
        String account = scanner.next();
        System.out.println("enter password");
        String password = scanner.next();
        Map<String, String> userlogininfo = new HashMap<>();
        userlogininfo.put("account", account);
        userlogininfo.put("password", password);
        return userlogininfo;
    }

    public static List<Account> queryAccount(String sql, Object... args) throws Exception {
        List<Account> accounts = new ArrayList<>();
        Connection conn = JDBCutil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmt = rs.getMetaData();
        int columnNum = rsmt.getColumnCount();
        while (rs.next()) {
            Account account = new Account();
            for (int i = 0; i < columnNum; i++) {
                Object columnValue = rs.getObject(i + 1);
                String columnName = rsmt.getColumnName(i + 1);
                Field field = account.getClass().getDeclaredField(columnName);
                field.setAccessible(true);
                field.set(account, columnValue);
            }
            accounts.add(account);
        }
        JDBCutil.close(conn, ps);

        return accounts;
    }

    public static boolean login(Map<String, String> userlogininfo) throws Exception {
        String sql = "select * from account where account=? and password=?";
        List<Account> accounts = queryAccount(sql, userlogininfo.get("account"), userlogininfo.get("password"));
        if (accounts.size() == 0) {
            return false;
        }
        return true;
    }
}
