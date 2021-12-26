package com.baizhan.Dao;

import com.baizhan.Utils.User;

import java.util.List;

public class UserDAOImpl extends BaseDao<User> implements UserDao {
    @Override
    public User getUser(String username) throws Exception {
        User u = null;
        String sql = "select * from baizhan.user where username = ?";
        //使用BaseDAO中的通用查询方法getBean
        List<User> list = this.getBean(sql, username);
        //判断是否有值
        if (list.size() != 0) {
            u = list.get(0);
        }
        return u;
    }

    @Override
    public void insertUser(User user) throws Exception {
        String sql = "insert into baizhan.user (username,password) values (?,?)";
        //使用BaseDAO中的通用增删改方法
        this.executeUpdate(sql, user.getUsername(), user.getPassword());
    }

    @Override
    public void deleteUserById(int id) throws Exception {
        String sql = "delete from baizhan.user where id = ?";
        //使用BaseDAO中的通用增删改方法
        this.executeUpdate(sql, id);
    }

    @Override
    public Integer getUserCount() throws Exception {
        String sql = "select count(*) from baizhan.user";
        //使用BaseDAO中获取单一值的方法
        Integer count = Integer.valueOf(this.getValue(sql).toString());
        return count;
    }
}
