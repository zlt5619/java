package com.itbaizhan.shuzu;

public class TestErWeiShuzu {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[2] = new int[3];
        a[1] = new int[4];
        a[0][0] = 100;
        a[0][1] = 200;

        //int a1[][]=new int[][4];   //非法

        int[][] b = {
                {1, 2, 3},
                {3, 4},
                {3, 5, 6, 7}
        };
    }
}
