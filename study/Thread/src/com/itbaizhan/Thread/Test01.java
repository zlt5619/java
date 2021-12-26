package com.itbaizhan.Thread;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread {
    public Thread1() {
        //获得当前线程的名字
        System.out.println(this.getName());
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ":start");
        for (int i = 0; i <= 20; i++) {
            System.out.println(this.getName() + ":" + i);
        }
        System.out.println(this.getName() + ":end");
    }
}
