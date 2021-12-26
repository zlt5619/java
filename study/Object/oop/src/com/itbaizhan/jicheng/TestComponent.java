package com.itbaizhan.jicheng;

public class TestComponent {

}

class Person2 {
    String name;
    int height;

    public void rest() {
        System.out.println("休息");
    }
}

class Student2 /*extends Person2*/ {
    Person2 p2 = new Person2();
    String major;

    public void study() {
        System.out.println("学习");
        p2.rest();
        System.out.println(this.p2.name);
    }

    public Student2(String name, int height, String major) {
        this.major = major;
        this.p2.height = height;
        this.p2.name = name;
    }
}
