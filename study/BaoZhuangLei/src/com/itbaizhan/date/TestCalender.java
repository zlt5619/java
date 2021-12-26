package com.itbaizhan.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2049, 10, 1, 22, 10, 50);
        System.out.println(calendar);

        //get
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);


        //set
        GregorianCalendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, 2049);

        //日历和时间转换
        Date d = calendar.getTime();
        GregorianCalendar calendar4 = new GregorianCalendar();
        calendar4.setTime(new Date());

        //日历加减
        GregorianCalendar calendar3 = new GregorianCalendar(2049, 9, 1, 22, 10, 50);
        calendar3.add(Calendar.MONTH, -7); // 月份减 7
        calendar3.add(Calendar.DATE, 7); // 增加 7 天


    }
}
