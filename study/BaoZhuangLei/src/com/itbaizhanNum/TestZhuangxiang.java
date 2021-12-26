package com.itbaizhanNum;

public class TestZhuangxiang {
    public static void main(String[] args) {
        //编译器自动装箱、拆箱
        Integer x = 100;
        int y = x;

        //报空指针异常
//        Integer z=null;
//        int z2=z;

        //自动装箱时，[-128,127]的数是由缓存的
        Integer x1 = 100;
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1 == x2); //true
        System.out.println(x3 == x4); //false
        System.out.println(x1.equals(x2)); //true
        System.out.println(x3.equals(x4)); //true
    }
}
