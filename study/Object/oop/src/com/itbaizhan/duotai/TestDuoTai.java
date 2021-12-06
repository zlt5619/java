package com.itbaizhan.duotai;

public class TestDuoTai {
    static void f(Person p){

        p.eat();
    }

    public static void main(String[] args) {
        f(new Amercian());
        f(new Chinese());
        f(new Indian());
    }
}

class Person{
    String name;

    public void eat(){
        System.out.println("eat");
    }
}

class Chinese extends Person{
    @Override
    public void eat(){
        System.out.println("chopstick");
    }
}
class Amercian extends Person{
    @Override
    public void eat(){
        System.out.println("fork");
    }
}
class Indian extends Person{
    @Override
    public void eat(){
        System.out.println("hand");
    }
}
