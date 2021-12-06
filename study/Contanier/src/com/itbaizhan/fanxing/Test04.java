package com.itbaizhan.fanxing;
/*
专门用于输出generic这个类的falg值
 */
public class Test04 {
    public static void main(String[] args) {
        ShowMsg showmsg=new ShowMsg();
        Generic<String> gs=new Generic<>();
        gs.setFlag("abc");
        showmsg.showFlag(gs);

        Generic<Integer> gi=new Generic<>();
        gi.setFlag(123);
        showmsg.showFlag(gi);


    }
}
