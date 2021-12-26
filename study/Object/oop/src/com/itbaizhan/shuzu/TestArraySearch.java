package com.itbaizhan.shuzu;

import java.util.Arrays;

public class TestArraySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 323, 23, 53, 12, 59};
        System.out.println(Arrays.binarySearch(a, 12));
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 12));
    }
}
