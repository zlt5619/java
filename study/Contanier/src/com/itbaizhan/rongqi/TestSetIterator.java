package com.itbaizhan.rongqi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetIterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        //获取迭代器对象
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
