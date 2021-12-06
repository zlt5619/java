package com.itbaizhan.shuzu;

public class Test03 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=(i+1)*100;
        }
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        String[] s= {"aa","bb","cc","dd"};
        for (String i:s) {
            System.out.println(i);
        }

    }
}
