package com.itbaizhanNum;

//仅限于练习
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public static MyInteger vauleOf(int value) {
        return new MyInteger(value);
    }

    public int intValue() {
        return value;
    }

    public static void main(String[] args) {
        MyInteger a = new MyInteger(10);
        MyInteger b = MyInteger.vauleOf(20);
    }
}
