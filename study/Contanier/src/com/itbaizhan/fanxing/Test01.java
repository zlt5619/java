package com.itbaizhan.fanxing;

public class Test01 {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setFlag("abc");
        System.out.println(generic.getFlag());

        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(100);
        Integer flag1 = generic1.getFlag();
        System.out.println(flag1);
    }
}
