package com.itbaizhan.shuzu;

import java.util.Arrays;

public class TestBianrySearch {
    public static void main(String[] args) {
        int[] a=new int[50];
        int index;
        for(int i=0;i<a.length;i++){
            a[i]=(int) (100*Math.random());
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        index=binarySearch1(a);
        if(index==-1){
            System.out.println("50不在此数组");
        }else{
            System.out.println("50在此数组的索引是："+index+"位");
        }
    }

    private static int binarySearch1(int[] a) {
        int low=0;
        int high=a.length-1;
        while (low<high){
            int middle=(low+high)/2;
            if(50==a[middle]){
                return middle;
            }
            if(50>a[middle]){
                low=middle+1;
            }
            if(50<a[middle]){
                high=middle-1;
            }
        }
        return -1;
    }
}
