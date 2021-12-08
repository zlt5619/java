package com.itbaizhan;

public class TestThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"开始");
        new Thread(()->{
            //定义子线程要做的事
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<20;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);

            }

        },"LambdaThread").start();

        System.out.println(Thread.currentThread().getName()+"结束");
    }
}
