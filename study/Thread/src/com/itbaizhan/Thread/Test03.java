package com.itbaizhan.Thread;

public class Test03 {
    public static void main(String[] args) {
        Account account = new Account("1234", 1000.00);
        new DrawCash("老公", account, 800).start();
        new DrawCash("老婆", account, 800).start();

    }
}

class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//取款的线程
class DrawCash extends Thread {
    private Account account;
    private double moneyNum;

    public DrawCash(String name, Account account, double moneyNum) {
        super(name);
        this.account = account;
        this.moneyNum = moneyNum;
    }

    @Override
    public void run() {
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
