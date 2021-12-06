package com.itbaizhan.fanxing;

public class Test02 {
    public static void main(String[] args) {
        IgenericImp1 i=new IgenericImp1();
        String name=i.getName("old dude");
        System.out.println(name);

        //接口引用，指向对象,需要在接口指定泛型类型
        //如果不指定类型，就相当于选择Object类型
        Igeneric<String> i1=new IgenericImp1();
    }
}
