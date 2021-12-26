package com.itbaizhan.fanxing;

/*
给定上限限定
 */
public class ShowMsg1 {
    public void showFlag(Generic<? extends Number> g) {

        System.out.println(g.getFlag());
    }
}
