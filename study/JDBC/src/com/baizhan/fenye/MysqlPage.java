package com.baizhan.fenye;

import com.baizhan.account.JDBCutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

public class MysqlPage {
    public static void main(String[] args) throws Exception {
        Page page = new Page();
        page.setCurrentPage(20);
        page.setPageSize(10);
        Page rspg = selectPage(page);
        System.out.println(rspg.getTotalPage());
        System.out.println(rspg.getTotalCount());
        System.out.println(rspg.getList());

    }

    public static Page selectPage(Page page) throws Exception {
        Connection conn = JDBCutil.getConnection();
        String sql = "select * from employees.employees limit ?,?";
        //预处理sql
        PreparedStatement ps = conn.prepareStatement(sql);
        //设置从哪里开始
        ps.setInt(1, (page.getCurrentPage() - 1) * page.getPageSize());
        //设置每页数量
        ps.setInt(2, page.getPageSize());
        //执行sql
        ResultSet rs = ps.executeQuery();
        //获取元数据
        ResultSetMetaData rsmd = rs.getMetaData();
        while (rs.next()) {
            Map<String, Object> map = new HashMap<>();
            //根据元数据填充map
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                String columnname = rsmd.getColumnName(i + 1);
                String columnvalue = rs.getString(i + 1);
                map.put(columnname, columnvalue);
            }
            page.getList().add(map);
        }
        //查询总记录数
        sql = "select count(*) from employees.employees";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            page.setTotalCount(count);
            Double totalpage = Math.ceil((double) count / (double) page.getPageSize());
            page.setTotalPage(totalpage.intValue());
        }


        return page;
    }
}
