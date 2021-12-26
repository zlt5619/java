package com.itbaizhan.rongqi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsShuffleTest {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");

        Collections.shuffle(l);
        for (String s : l) {
            System.out.println(s);
        }
    }
}
