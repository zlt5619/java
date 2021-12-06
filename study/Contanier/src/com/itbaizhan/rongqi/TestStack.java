package com.itbaizhan.rongqi;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        //实例化栈容器
        Stack<String> s=new Stack<>();
        boolean flag=s.empty();
        System.out.println(flag);
        System.out.println("==============");
        s.push("zlt");
        s.push("zzm");
        s.push("lh");
        flag=s.empty();
        System.out.println(flag);
        System.out.println(s.peek());
        System.out.println("==============");
        System.out.println(s.size());
        System.out.println(s.search("lh"));
        int len=s.size();
        for(int i=0;i<len;i++){
            String tmp=s.pop();
            System.out.println(tmp);
        }
        System.out.println(s.empty());
        System.out.println("==============");

    }
}
