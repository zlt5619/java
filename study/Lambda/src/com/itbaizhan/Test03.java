package com.itbaizhan;

public class Test03 {
    public static void main(String[] args) {
        final int num = 10;

//        NoReturnNoParam noReturnNoParam=new NoReturnNoParam(){
//
//            @Override
//            public void method() {
//                System.out.println(num);
//            }
//        };
        //新的写法，调用闭包
        NoReturnNoParam noReturnNoParam = () -> System.out.println(num);
        noReturnNoParam.method();
    }
}
