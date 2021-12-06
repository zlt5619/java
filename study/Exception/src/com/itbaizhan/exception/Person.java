package com.itbaizhan.exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0){
            throw new IllegalAgeException("人的年龄不应为负数");
        }
        this.age = age;
    }
}
