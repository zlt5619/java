package com.itbaizhan.IO;

import java.io.Serializable;

//被序列化的对象必须要实现 Serializable 序列化接口
public class User implements Serializable {
    private int userid;
    private String username;
    private String userage;

    public User(int userid, String username, String userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage='" + userage + '\'' +
                '}';
    }
}
