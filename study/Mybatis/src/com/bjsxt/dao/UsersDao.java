package com.bjsxt.dao;

import com.bjsxt.pojo.Users;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface UsersDao {
    List<Users> selectUsersAll() throws IOException;
    Users selectUsersById(int userid)throws IOException;
    void insertUsers(Users users);
    void deleteUsersById(int userid);
    //更新用户,先查询到,再更新
    Users selectUsersById2(int userid);
    void updateUsersById(Users users);
    Map<Integer,Users> selectUserByNameAndSex(String username, String usersex);
}
