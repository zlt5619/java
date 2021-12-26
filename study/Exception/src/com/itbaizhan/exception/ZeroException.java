package com.itbaizhan.exception;

public class ZeroException {
    public static void main(String[] args) {
        System.out.println("111");
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("222");
    }

}
