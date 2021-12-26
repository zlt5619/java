package com.itbaizhan.shuzu;

public class Test01 {
    public static void main(String[] args) {
        int[] s = null;
        s = new int[10];
        for (int i = 1; i <= 10; i++) {
            s[i - 1] = i;
            System.out.println(s[i - 1]);
        }

    }
}
