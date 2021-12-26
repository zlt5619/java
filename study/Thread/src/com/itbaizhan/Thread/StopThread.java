package com.itbaizhan.Thread;

import java.io.IOException;

public class StopThread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":start");
        int i = 0;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ":end");

    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("main start");
        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        t1.start();
        System.in.read();
        st.stop();
        System.out.println("main end");
    }
}
