package com.itbaizhan;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//传统实现方式
//先实现具体类
//再调用相关方法
class ConsumeImp implements Consumer{

    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}

public class TestCoolection {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        ConsumeImp c=new ConsumeImp();
        list.forEach(c);
        System.out.println("==============");
        list.removeIf(ele->ele.equals("b"));
        list.forEach(System.out::println);
    }
}
