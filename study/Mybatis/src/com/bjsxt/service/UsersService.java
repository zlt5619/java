package com.bjsxt.service;

import com.bjsxt.pojo.Users;

import java.util.Map;

public interface UsersService {
    void addUsers(Users users);
    void dropUsersById(int userid);
    Users preUpdateUsers(int userid);
    void modifyUsers(Users users);
    Map<Integer,Users> findUsersByNameAndSex(String username,String usersex);
}
