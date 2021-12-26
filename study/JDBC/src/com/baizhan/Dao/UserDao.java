package com.baizhan.Dao;

import com.baizhan.Utils.User;

public interface UserDao {
    //根据username获取一条信息
    User getUser(String username) throws Exception;

    //插入一条记录
    void insertUser(User user) throws Exception;

    //根据id号删除相应数据
    void deleteUserById(int id) throws Exception;

    //获取user总数
    Integer getUserCount() throws Exception;
}
