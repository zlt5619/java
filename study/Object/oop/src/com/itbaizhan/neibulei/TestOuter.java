package com.itbaizhan.neibulei;

public class TestOuter {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.show();
    }
}
