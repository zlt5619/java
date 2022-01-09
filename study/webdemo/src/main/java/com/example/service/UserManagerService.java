package com.example.service;

import com.example.pojo.Users;

import java.util.List;

public interface UserManagerService {
    void addUser(Users user);
    List<Users> findUser(Users users);
    Users findUserByUserId(int id);
    void modifyUser(Users users);
}
