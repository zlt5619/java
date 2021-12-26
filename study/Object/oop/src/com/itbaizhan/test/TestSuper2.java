package com.itbaizhan.test;

public class TestSuper2 {
    public static void main(String[] args) {
        new Child();
    }
}

class Father {
    public Father() {
        System.out.println("FatherConstructor");
    }

    public Father(int id) {
        System.out.println("Father:" + id);
    }
}

class Child extends Father {
    public Child() {
        System.out.println("ChildConstructor");
    }

    public Child(int id) {

        System.out.println("Child:" + id);
    }
}
