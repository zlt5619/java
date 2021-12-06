package com.itbaizhan.shuzu;
import java.util.Arrays;
/*
array的输出
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
public class TestArrayOutput {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }
}
