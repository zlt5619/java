package com.itbaizhan.rongqi;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        //list接口方法
        l1.add("zlt");
        l1.add("zzm");
        l1.add("lh");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("-------------------");
        for(String str :l1){
            System.out.println(str);
        }
        //非list标准方法
        l1.addFirst("aaa");
        l1.addLast("zzz");
        for(String str :l1){
            System.out.println(str);
        }


    }
}
