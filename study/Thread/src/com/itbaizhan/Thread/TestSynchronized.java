package com.itbaizhan.Thread;

public class TestSynchronized {
    public static void main(String[] args) {
        Account account = new Account("1234", 1000.00);
        new DrawCash02("老公", account, 800).start();
        new DrawCash02("老婆", account, 800).start();
//        Account account1=new Account("123",1200);
//        new DrawCash02("老公",account,800).start();
//        new DrawCash02("老婆",account1,800).start();

    }
}

//取款的线程
class DrawCash02 extends Thread {
    private Account account;
    private double moneyNum;

    public DrawCash02(String name, Account account, double moneyNum) {
        super(name);
        this.account = account;
        this.moneyNum = moneyNum;
    }

    @Override
    public void run() {
        //使用sychronized方法进行同步处理
        synchronized (this.account) {
            //判断当前账户余额和取款数目的关系
            if (this.account.getBalance() >= this.moneyNum) {
                System.out.println(this.getName() + ":取钱成功,取钱数量 ：" + this.moneyNum);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.account.setBalance(this.account.getBalance() - this.moneyNum);
                System.out.println("当前余额为：" + this.account.getBalance());

            } else {
                System.out.println(this.getName() + "：取钱失败，余额不足");
            }
        }

    }
}
