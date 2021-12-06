package com.itbaizhan.string;

public class TestString02 {
    public static void main(String[] args) {
        String s="abc";
        StringBuffer s1 =new StringBuffer(s);

        s1.append(s);
        System.out.println(s1);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<7;i++){
            sb.append((char) 'a'+i);//追加单个字符
        }
        System.out.println(sb);
        sb.append("I can't sing my ABC");
        System.out.println(sb.toString());

        StringBuffer s2=new StringBuffer("尚学堂");
        s2.insert(0,"爱");
        System.out.println(s2.toString());
        s2.delete(3,4);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);

    }
}
