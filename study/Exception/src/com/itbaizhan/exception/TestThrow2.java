package com.itbaizhan.exception;

public class TestThrow2 {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setAge(-1);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }
}
