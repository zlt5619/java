package com.itbaizhan.jiekou;

public interface TestDefault {
    void printInfo();

    default void moren() {
        System.out.println("defalt");
    }

    ;
}

class Test01 implements TestDefault {

    @Override
    public void printInfo() {

    }
}
