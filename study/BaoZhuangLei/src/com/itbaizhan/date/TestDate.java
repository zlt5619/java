package com.itbaizhan.date;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long nowNum=System.currentTimeMillis();
        System.out.println(nowNum);
        Date date1=new Date(10000003030L);
        System.out.println(date1);
        System.out.println(date1.getTime());

        Date date2=new Date(21L*365*24*3600*1000);
        System.out.println(date2);

        Date date3=new Date();
        System.out.println(date3.equals(date2));
        System.out.println(date3.after(date2));
        System.out.println(date3.before(date2));
    }
}
