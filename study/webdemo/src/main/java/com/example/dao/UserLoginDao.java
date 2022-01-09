package com.example.dao;

import com.example.pojo.Users;

public interface UserLoginDao {
    public Users selectUsersByUserNameAndUserPwd(String username,String userpwd);
}
