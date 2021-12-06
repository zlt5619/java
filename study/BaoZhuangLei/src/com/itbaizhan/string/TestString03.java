package com.itbaizhan.string;

public class TestString03 {
    public static void main(String[] args) {
        String str1="";
        long num1=Runtime.getRuntime().freeMemory();
        long time1=System.currentTimeMillis();
        for(int i=0;i<5000;i++) {
            str1 = str1 + i;
        }
        long num2=Runtime.getRuntime().freeMemory();
        long time2=System.currentTimeMillis();
        System.out.println("内存占用："+(num1-num2));
        System.out.println("时间消耗："+(time2-time1));

        System.out.println("==================");
        StringBuilder sb1=new StringBuilder("");
        long num3=Runtime.getRuntime().freeMemory();
        long time3=System.currentTimeMillis();
        for(int i=0;i<5000;i++) {
            sb1.append(i);
        }
        long num4=Runtime.getRuntime().freeMemory();
        long time4=System.currentTimeMillis();
        System.out.println("内存占用："+(num3-num4));
        System.out.println("时间消耗："+(time4-time3));

    }
}
