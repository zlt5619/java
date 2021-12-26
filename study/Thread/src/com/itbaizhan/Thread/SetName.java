package com.itbaizhan.Thread;

public class SetName {
    public static void main(String[] args) {
        SetName1 s = new SetName1("zlt-Thread");
        Thread t = new Thread(s);
        t.start();
        SetName2 s2 = new SetName2();
        Thread t2 = new Thread(s2);
        t2.setName("zzm-Thread");
        t2.start();


    }
}

class SetName1 extends Thread {
    public SetName1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

class SetName2 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
