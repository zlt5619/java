package com.itbaizhan.string;

public class TestString {
    public static void main(String[] args) {
        String str1 = "abcdjlda";
        String str2 = str1.substring(2, 4);
        System.out.println(str2);

        String s3 = "Hello" + "Java";
        String s4 = "HelloJava";
        System.out.println(s3 == s4);
        String s5 = "abc";
        String s6 = "def";
        String s7 = s5 + s6;
        String s8 = "abcdef";
        System.out.println(s7 == s8);
    }

}
