package com.itbaizhan.jicheng;

public class Test02 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Vehicle v1 = h1.getVehicle();
        v1.run();
    }
}

class Vehicle {
    public void run() {
        System.out.println("跑");
    }

    public Vehicle getVehicle() {
        System.out.println("给你一个交通工具");
        return null;
    }
}

class Horse extends Vehicle {
    @Override
    public void run() {
        System.out.println("马在跑");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("给你一匹马");
        return this;
    }
}
