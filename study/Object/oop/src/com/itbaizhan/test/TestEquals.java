package com.itbaizhan.test;

import java.util.Objects;

public class TestEquals {
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEquals that = (TestEquals) o;
        return id == that.id;
    }


    public static void main(String[] args) {
        TestEquals t1=new TestEquals();
        TestEquals t2=new TestEquals();
        t1.id=1;
        t2.id=1;
        System.out.println(t1.equals(t2));
        System.out.println(t1==t2);
    }

}
