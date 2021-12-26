package com.itbaizhan.Thread;

public class Test02 implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Test02 t1 = new Test02();
        Test02 t2 = new Test02();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread1.start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":start");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        System.out.println(Thread.currentThread().getName() + ":end");
    }
}
