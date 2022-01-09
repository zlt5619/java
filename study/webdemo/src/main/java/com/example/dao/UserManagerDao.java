package com.example.dao;

import com.example.pojo.Users;
import com.example.service.UserManagerService;

import java.util.List;

public interface UserManagerDao {
    void insertUser(Users user);
    List<Users> selectUserByProperty(Users user);
    Users selectUserByUserId(int id);
    void updateUserByUserId(Users users);
}
