package com.itbaizhan.fengzhuang;

public class TestFengzhaung01 {
    public static void main(String[] args) {
        User u = new User();
        u.setId(10);
        u.setName("zlt");
        u.isMan(true);
        u.printUserInfo();

    }
}

//Javabean
class User {
    private int id;
    private String name;
    private boolean man;

    public void printUserInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(man);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMan(boolean b) {
        return man;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
