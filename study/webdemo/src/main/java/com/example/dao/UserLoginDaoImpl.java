package com.example.dao;

import com.example.pojo.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserLoginDaoImpl implements UserLoginDao{
    @Override
    public Users selectUsersByUserNameAndUserPwd(String username, String userpwd) {
        Users user=null;
        Connection conn=null;
        try{
            conn=JDBCUtils.getConnection();
            PreparedStatement ps=conn.prepareStatement("select * from users where username=? and userpwd=?");
            ps.setString(1,username);
            ps.setString(2,userpwd);
            ResultSet resultSet=ps.executeQuery();
            while(resultSet.next()){
                user=new Users();
                user.setUsersex(resultSet.getString("usersex"));
                user.setUserpwd(resultSet.getString("userpwd"));
                user.setUsername(resultSet.getString("username"));
                user.setUserid(resultSet.getInt("userid"));
                user.setPhonenumber(resultSet.getString("phonenumber"));
                user.setQqnumber(resultSet.getString("qqnumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

        }
        return user;
    }
}
