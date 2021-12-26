package com.itbaizhan.Thread;

//定义馒头
class Mantou {
    private int id;

    public Mantou(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//定义缓冲区
class SyncStack {
    //存放馒头
    private Mantou[] mt = new Mantou[100];
    //操作馒头的索引
    private int mantouindex;

    //放馒头
    public synchronized void putMantou(Mantou m) {
        while (this.mantouindex == mt.length) {
            try {
                //wait方法只能用在synchronized方法中使用，先释放对象锁，再锁定该进程
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒取馒头的线程
        //notify方法只能用在synchronized方法中使用
        //唤醒等待中的方法
        this.notify();
        this.mt[this.mantouindex] = m;
        this.mantouindex++;
    }

    //去馒头
    public synchronized Mantou getMantou() {
        while (this.mantouindex == 0) {
            try {
                //wait方法只能用在synchronized方法中使用，先释放对象锁，再锁定该进程
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        this.mantouindex--;
        return this.mt[mantouindex];
    }
}

/*** 定义生产者线程类 */
class ShengChan extends Thread {
    private SyncStack ss;

    public ShengChan(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("produce mantou:" + i);
            Mantou mantou = new Mantou(i);
            this.ss.putMantou(mantou);
        }
    }
}

/*** 定义消费者线程类 */
class Xiaofei extends Thread {
    private SyncStack ss;

    public Xiaofei(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("xiaofei mantou:" + i);
            Mantou mantou = this.ss.getMantou();
        }
    }
}

public class TestMode {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        new ShengChan(ss).start();
        new Xiaofei(ss).start();
    }
}

