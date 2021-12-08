package com.itbaizhan.rongqi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");

        //获取迭代器对象
        Iterator<String> i=l.iterator();
        //使用while循环
        while(i.hasNext()){
            String value = i.next();
            System.out.println(value);
        }
        //使用for循环
        System.out.println("=========");
        for(Iterator<String> it = l.iterator();it.hasNext();){
            String value = it.next();
            System.out.println(value);
        }

    }
}
