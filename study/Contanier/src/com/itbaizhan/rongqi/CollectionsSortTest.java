package com.itbaizhan.rongqi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortTest {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("c");
        l.add("a");
        l.add("z");
        l.add("m");

        Collections.sort(l);
        for(String s:l){
            System.out.println(s);
        }
    }
}
