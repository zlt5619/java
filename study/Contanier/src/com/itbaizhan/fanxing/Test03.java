package com.itbaizhan.fanxing;

public class Test03 {

    public static void main(String[] args) {
        MethdoGeneric m=new MethdoGeneric();
        String name="zlt";
        m.setName(name);
        m.setName(123123);

        String a=m.getName("abc");
        System.out.println(a);

        MethdoGeneric.setFlag("aaa");

        MethdoGeneric m2=new MethdoGeneric();
        String[] arr=new String[]{"a","b","c"};
        m2.method(arr);
    }
}
