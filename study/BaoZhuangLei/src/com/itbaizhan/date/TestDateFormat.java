package com.itbaizhan.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
时间和字符串的转换
 */
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str="2049-10-1 10:10:10";
        try {
            Date guoqin100=format.parse(str);
            System.out.println(guoqin100.getTime());
            System.out.println(guoqin100);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date2=new Date(3423424234234L);
        String str2=format2.format(date2);
        System.out.println(str2);

        //tips
        Date now=new Date();
        DateFormat f1=new SimpleDateFormat("今年的第D天，第w周");
        String s=f1.format(now);
        System.out.println(s);

    }
}
