package com.itbaizhan.fanxing;

public class MethdoGeneric {

    public <T> void setName(T name) {
        System.out.println(name);
    }

    public <T> T getName(T name) {
        return name;
    }

    public static <T> void setFlag(T flag) {
        System.out.println(flag);
    }

    public static <T> T getFlag(T flag) {
        return flag;
    }

    public <T> void method(T... args) {
        for (T a : args) {
            System.out.println(a);
        }
    }

}
