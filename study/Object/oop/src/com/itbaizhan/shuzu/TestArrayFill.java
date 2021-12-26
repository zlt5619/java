package com.itbaizhan.shuzu;

import java.util.Arrays;

public class TestArrayFill {
    public static void main(String[] args) {
        int[] a = {1, 2, 323, 23, 53, 12, 59};
        Arrays.fill(a, 2, 4, 100);
        System.out.println(Arrays.toString(a));
    }
}
