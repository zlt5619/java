package com.itbaizhan.MeiJu;

import java.util.Random;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Week.星期一);
        //循环打印
        for(Season s:Season.values()){
            System.out.println(s);
        }
        int a=new Random().nextInt(4);
        switch (Season.values()[a]) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break; }
    }
}

/**季节*/
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
/**星期*/
enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}