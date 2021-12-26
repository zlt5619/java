package com.itbaizhan.jiekou;

public class MultipleInterfaceTest {
    public static void main(String[] args) {
        CImp c = new CImp();
        c.testA();
        c.testB();
        c.testC();
    }
}

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A, B {
    void testC();
}

class CImp implements C {

    @Override
    public void testA() {
        System.out.println("A");
    }

    @Override
    public void testB() {
        System.out.println("B");
    }

    @Override
    public void testC() {
        System.out.println("C");
    }
}


