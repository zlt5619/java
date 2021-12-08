package com.itbaizhan;

public class Test02 {

    public static void main(String[] args) {
//        ReturnOneParam returnOneParam=a -> doubleNum(a);
        //另一种表达方式
        ReturnOneParam returnOneParam=Test02::doubleNum;

        int b=returnOneParam.method(10);
        System.out.println(b);

        Test02 t=new Test02();
//        ReturnOneParam returnOneParam1=a->t.addNum(a);
        ReturnOneParam returnOneParam1=t::addNum;
        int c=returnOneParam1.method(10);
        System.out.println(c);
    }

    public static int doubleNum(int a){
        return 2*a;
    }

    public int addNum(int a){
        return a+2;
    }
}
