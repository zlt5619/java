package com.itbaizhan.shuzu;
/*
冒泡排序算法的运作如下：
 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最 后的元素应该会是最大的数。
 3. 针对所有的元素重复以上的步骤，除了最后一个。
 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

import java.util.Arrays;

public class TestMaoPaoSuanFa {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(int) (10*Math.random());
        }
        System.out.println(Arrays.toString(a));
//        bubbleSort(a);
//        System.out.println(Arrays.toString(a));
        bubbleSort2(a);
        System.out.println("=====");
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort2(int[] a) {
        int temp=0;

        for(int i=0;i<a.length;i++){
            boolean flag=true;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    flag=false;
                }
            }
            //如果状态未发生改变，就可以结束了
            if(flag){
                System.out.println("第"+i+"次终结");
                break;

            }

        }
    }

    public static void bubbleSort(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
