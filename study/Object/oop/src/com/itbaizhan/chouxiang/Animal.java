package com.itbaizhan.chouxiang;

public abstract class Animal {
    int age;

    public abstract void rest();

    public abstract void run();
}

class Dog extends Animal{
    @Override
    public void rest() {
        System.out.println("dog rest");
    }

    @Override
    public void run() {
        System.out.println("dog run");
    }
}
