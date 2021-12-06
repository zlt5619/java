/*
数组的拷贝
 */
package com.itbaizhan.shuzu;

public class TestArrayCopy {
    public static void main(String[] args) {
        int[] a=new int[10];
        int[] b=new int[15];
        for(int i=0;i<10;i++){
            a[i]=i+1;
        }
        System.arraycopy(a,0,b,0,a.length);
        for(int i:b){
            System.out.println(i);

        }    }
}
