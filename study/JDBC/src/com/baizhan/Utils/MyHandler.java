package com.baizhan.Utils;

import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MyHandler implements ResultSetHandler {
    @Override
    public Map<String, String> handle(ResultSet resultSet) throws SQLException {
        Map<String, String> map = null;
        if (resultSet.next()) {
            map = new HashMap<>();
            map.put("id", resultSet.getString("id"));
            map.put("username", resultSet.getString("username"));
            map.put("password", resultSet.getString("password"));
        }
        return map;
    }
}
