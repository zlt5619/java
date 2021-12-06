package com.itbaizhan.exception;

public class TestBreakPoint {
    int num=10;
    public void run(int a){
        for(int i=0;i<a;i++){
            System.out.println("TestBreakPoint");
            num+=a;
            go();
        }
    }

    private void go() {
        System.out.println("TestBreakPoint2");
        System.out.println("num:"+num);
    }

    public static void main(String[] args) {
        TestBreakPoint t=new TestBreakPoint();
        t.run(5);
    }
}
