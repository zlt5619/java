package com.example.dao;

import com.example.pojo.Users;
import jdk.nashorn.internal.scripts.JD;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 用户管理持久层
 */

public class UserManagerDaoImpl implements  UserManagerDao{


    @Override
    public void insertUser(Users user) {
        Connection conn=null;
        //运用事务思想
        try{
            conn=JDBCUtils.getConnection();
            //关闭自动提交
            conn.setAutoCommit(false);
            PreparedStatement ps=conn.prepareStatement("insert into users values(default ,?,?,?,?,?)");
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getUserpwd());
            ps.setString(3,user.getUsersex());
            ps.setString(4,user.getPhonenumber());
            ps.setString(5,user.getQqnumber());
            ps.execute();
            conn.commit();

        }catch (Exception e){
            e.printStackTrace();
            JDBCUtils.rollbackConnection(conn);
        }finally {
            JDBCUtils.closeConnection(conn);
        }
    }

    @Override
    public List<Users> selectUserByProperty(Users users) {
        Connection conn=null;
        List<Users> list = new ArrayList<>();
        try{
            conn=JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql=this.createSql(users);
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            while(resultSet.next()){
                Users user = new Users();
                user.setUserid(resultSet.getInt("userid"));
                user.setPhonenumber(resultSet.getString("phonenumber"));
                user.setQqnumber(resultSet.getString("qqnumber"));
                user.setUserpwd(resultSet.getString("userpwd"));
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
                list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
            JDBCUtils.rollbackConnection(conn);
        }
        finally {
            JDBCUtils.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Users selectUserByUserId(int id) {
        Connection conn=null;
        Users user=null;
        try{
            conn = JDBCUtils.getConnection();
            PreparedStatement preparedStatement =
                    conn.prepareStatement("select * from users where userid = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                user = new Users();
                user.setUserid(resultSet.getInt("userid"));
                user.setPhonenumber(resultSet.getString("phonenumber"));
                user.setQqnumber(resultSet.getString("qqnumber"));
                user.setUserpwd(resultSet.getString("userpwd"));
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection(conn);
        }
        return user;
    }

    @Override
    public void updateUserByUserId(Users users) {
        Connection conn = null;
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement =
                    conn.prepareStatement("update users set username=? ,usersex= ?,phonenumber=?,qqnumber = ? where userid = ? ");
            preparedStatement.setString(1,users.getUsername());
            preparedStatement.setString(2,users.getUsersex());
            preparedStatement.setString(3,users.getPhonenumber());
            preparedStatement.setString(4,users.getQqnumber());
            preparedStatement.setInt(5,users.getUserid());
            preparedStatement.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JDBCUtils.rollbackConnection(conn);
        }finally {
            JDBCUtils.closeConnection(conn);
        }
    }

    //拼接查询的语句
    private String createSql(Users users) {
        StringBuffer stringBuffer=new StringBuffer("select * from users where 1=1");
        if(users.getUsersex() != null && users.getUsersex().length() > 0){
            stringBuffer.append(" and usersex = "+users.getUsersex());
        }
        if(users.getQqnumber() != null && users.getQqnumber().length() >
                0){
            stringBuffer.append(" and qqnumber = "+users.getQqnumber());
        }
        if(users.getUsername() != null && users.getUsername().length() >
                0){
            stringBuffer.append(" and username = '"+users.getUsername()+"'");
        }
        if(users.getPhonenumber() != null
                &&users.getPhonenumber().length() > 0){
            stringBuffer.append(" and phonenumber = "+users.getPhonenumber());
        }
        return stringBuffer.toString();

    }
}
