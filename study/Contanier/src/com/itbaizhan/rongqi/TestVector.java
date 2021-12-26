package com.itbaizhan.rongqi;

import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        List<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("a");
        for (String i : v) {
            System.out.println(i);
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
