package com.itbaizhan.Thread;

import sun.awt.windows.ThemeReader;

public class JoinThread02 {
    public static void main(String[] args) {
        Thread t = new Thread(new fatherThread());
        t.start();
    }
}

class sonThread implements Runnable {

    @Override
    public void run() {
        System.out.println("son buy cigarette");
        System.out.println("wait");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("buy cigereete");

    }
}

class fatherThread implements Runnable {

    @Override
    public void run() {
        System.out.println("want to smoke without cigarette");
        System.out.println("sent son to buy cigarette");
        Thread t = new Thread(new sonThread());
        t.start();
        System.out.println("wait for son");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("find son");
            System.exit(1);
        }
        System.out.println("smoke");
    }
}
