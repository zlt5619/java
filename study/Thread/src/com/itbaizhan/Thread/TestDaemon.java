package com.itbaizhan.Thread;

public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Daemon(), "Daemon");
        //将线程设置为守护线程
        t.setDaemon(true);
        t.start();
        Thread.sleep(2000);
        System.out.println("main exit");
    }
}

class Daemon implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
