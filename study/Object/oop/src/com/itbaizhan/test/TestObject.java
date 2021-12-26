package com.itbaizhan.test;

public class TestObject extends Object {
    String name;
    String pwd;

    @Override
    public String toString() {
        return "账户名" + name + "密码" + pwd;
    }

    public static void main(String[] args) {
        TestObject to = new TestObject();
        System.out.println(to.toString());
        TestObject to2 = new TestObject();
        System.out.println(to2.toString());
    }
}
