package com.itbaizhan.rongqi;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加元素
        set.add("a");
        set.add("b1");
        set.add("c2");
        set.add("d");
        set.add("a");
        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("--------------------");

        //删除元素
        boolean flag = set.remove("c2");
        System.out.println(flag);
        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("------------------------");
        int size = set.size();
        System.out.println(size);

    }
}
