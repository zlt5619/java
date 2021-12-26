package com.itbaizhan.Thread;

public class SleepThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":start");
        SleepThread st = new SleepThread();
        Thread t = new Thread(st);
        t.start();
        System.out.println(Thread.currentThread().getName() + ":end");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":start");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":end");
    }
}
