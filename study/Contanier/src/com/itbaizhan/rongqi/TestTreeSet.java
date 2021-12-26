package com.itbaizhan.rongqi;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");

        for (String i : s) {
            System.out.println(i);
        }
        System.out.println("-------------");


    }
}
