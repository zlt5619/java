package com.itbaizhan.Thread;

public class TestThisLock {
    public static void main(String[] args) {
        Programmer p = new Programmer("zlt");
        new Working2(p).start();
        new Working1(p).start();

    }
}

class Programmer {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //打开电脑
    public void computer() {
        synchronized (this) {
            try {
                System.out.println(this.name + "接通电源");
                Thread.sleep(500);
                System.out.println(this.name + "按开机按键");
                Thread.sleep(500);
                System.out.println(this.name + "系统启动中");
                Thread.sleep(500);
                System.out.println(this.name + "系统启动成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public void coding() {
        synchronized (this) {
            try {
                System.out.println(this.name + "双击IDEA");
                Thread.sleep(500);
                System.out.println(this.name + "IDEA启动");
                Thread.sleep(500);
                System.out.println(this.name + "写代码");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Working1 extends Thread {
    private Programmer p;

    public Working1(Programmer p) {
        this.p = p;
    }

    @Override
    public void run() {
        this.p.computer();
    }
}

class Working2 extends Thread {
    private Programmer p;

    public Working2(Programmer p) {
        this.p = p;
    }

    @Override
    public void run() {
        this.p.coding();
    }
}

