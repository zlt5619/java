package com.itbaizhan.fanxing;

/*
专门用于输出generic这个类的flag值
 */
public class ShowMsg {
    public void showFlag(Generic<?> g) {
        System.out.println(g.getFlag());
    }
}
