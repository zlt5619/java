package com.example.jsp;

public class User {
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }
    public User(){

    }

    public User(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
}
