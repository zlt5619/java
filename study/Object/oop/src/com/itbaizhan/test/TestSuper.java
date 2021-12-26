package com.itbaizhan.test;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass {
    public int value;
    public int age;

    public void f() {
        value = 100;
        System.out.println("Father_value:" + value);
    }
}

class ChildClass extends FatherClass {
    public int value;
    public int age;

    public void f() {
        super.f();//调用父类普通方法
        value = 200;
        System.out.println("Child_value:" + value);
        System.out.println(value);
        System.out.println(super.value);
    }

    public void f2() {
        System.out.println(age);
    }
}
