package com.itbaizhanNum;

public class TestInteger {


    public static void main(String[] args) {
        //推荐使用
        Integer i=Integer.valueOf(10);
        int a=i.intValue();     //把包装类转为进本数据类型
        double d=i.doubleValue();

        try {
            Integer n=Integer.valueOf("456m");
            int c=n.intValue();
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Integer m=Integer.valueOf("456");
            int b=m.intValue();
            System.out.println(b);
            System.out.println("over");
        }
        //把字符串转为数字

    }



}
