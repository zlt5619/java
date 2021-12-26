package com.itbaizhan;

import java.util.concurrent.Callable;

//无返回值，无参数
@FunctionalInterface
interface NoReturnNoParam {
    void method();
}

//无返回值，有一个参数
@FunctionalInterface
interface NoReturnOneParam {
    void method(int a);
}

//无返回值，多个参数
@FunctionalInterface
interface NoReturnMultiParam {
    void method(int a, int b);
}

//有返回值无参数
@FunctionalInterface
interface ReturnNoParam {
    int method();
}

//有返回值有参数
@FunctionalInterface
interface ReturnOneParam {
    int method(int a);
}

//有返回值有参数
@FunctionalInterface
interface ReturnMultiParam {
    int method(int a, int b);
}

public class TestLambda01 {
    public static void main(String[] args) {
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();

        NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println("NoReturnOneParam " + a);
        };
        noReturnOneParam.method(10);

        NoReturnMultiParam noReturnMultiParam = (int a, int b) -> {
            System.out.println("NoReturnMultiParam " + a + "\t" + b);
        };
        noReturnMultiParam.method(10, 20);

        ReturnNoParam returnNoParam = () -> {
            System.out.println("ReturnNoParam ");
            return 10;
        };
        int a1 = returnNoParam.method();
        System.out.println(a1);

        ReturnOneParam returnOneParam = (int a) -> {
            System.out.print("ReturnOneParam ");
            return a;
        };
        System.out.println(returnOneParam.method(10));

        ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.print("ReturnMultiParam ");
            return a + b;
        };
        System.out.println(returnMultiParam.method(10, 20));
    }
}
