package com.itbaizhan.shuzu;

import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Man1[] mans = {new Man1(22), new Man1(19), new Man1(20)};
        System.out.println(Arrays.toString(mans));
        Arrays.sort(mans);
        System.out.println(Arrays.toString(mans));

    }
}

class Man1 implements Comparable {
    private int age;

    @Override
    public String toString() {
        return "Man1{" +
                "age=" + age +
                '}';
    }

    public Man1(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Man1 man2 = (Man1) o;
        if (this.age > man2.age) {
            return 1;
        } else {
            return -1;
        }

    }
}
