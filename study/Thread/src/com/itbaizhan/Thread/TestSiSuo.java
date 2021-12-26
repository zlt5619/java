package com.itbaizhan.Thread;

public class TestSiSuo {
    public static void main(String[] args) {
        Makeup m1 = new Makeup();
        m1.setFlag(0);
        m1.setGirlName("zzm");
        Makeup m2 = new Makeup();
        m2.setFlag(1);
        m2.setGirlName("zlt");
        m1.start();
        m2.start();

    }
}

class Lipstick {

}

class Mirror {

}

class Makeup extends Thread {
    private int flag;
    //flag=0:拿着口红。flag!=0:拿着镜子
    private String girlName;
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    public int getFlag() {
        return flag;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    @Override
    public void run() {
        this.doMakeup();
    }

    private void doMakeup() {
        if (flag == 0) {
            synchronized (lipstick) {
                System.out.println(this.girlName + " 拿着口红");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mirror) {
                    System.out.println(this.girlName + " 拿着镜子");
                }
            }

        } else {
            synchronized (mirror) {
                System.out.println(this.girlName + " 拿着镜子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lipstick) {
                    System.out.println(this.girlName + " 拿着口红");
                }
            }
        }
    }
}
