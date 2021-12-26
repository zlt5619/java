package com.itbaizhan.rongqi;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList01 {
    public static void main(String[] args) {
        //实例化Array List容器
        List<String> aList = new ArrayList<>();
        //添加元素
        boolean flag = aList.add("abc");
//        System.out.println(flag);
        aList.add("bcd");
        aList.add("cde");
        System.out.println(aList);
        //添加元素
        aList.add(1, "xyz");
        System.out.println(aList);

        //获取元素
        String target_str = aList.get(2);
        System.out.println(target_str);

        //获取List长度
        System.out.println(aList.size());
        //打印List全部元素
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        //替换元素
        aList.set(2, "replacement");
        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i) + "\t");
        }

        //根据索引删除元素
        System.out.println();
        aList.add("123");
        aList.add("234");
        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i) + "\t");
        }
        aList.remove(3);
        System.out.println();
        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i) + "\t");
        }

        //根据内容删除元素
        aList.remove("xyz");
        System.out.println();
        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i) + "\t");

        }
        System.out.println();
        //判断容器中是否包含指定元素
        System.out.println(aList.contains("zlt"));
        System.out.println(aList.contains("abc"));

        //查找元素的位置
        int index = aList.indexOf("abc");
        System.out.println(index);

        //将ArrayList转为object数组,不能强转成String数组或其他类型数组
        //不能集体强转，只能获取单个object对象，再进行转型
        Object[] strList = aList.toArray();
        System.out.println(strList);

        //转换泛型类型数组
        String[] strList2 = aList.toArray(new String[aList.size()]);
        System.out.println(strList2);

        //清空容器
        aList.clear();
        System.out.println(aList);

        boolean flag2 = aList.isEmpty();
        System.out.println(flag2);
        System.out.println("===========");

        //并集操作
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        List<String> b = new ArrayList<>();
        b.add("b");
        b.add("c");
        b.add("d");
        boolean flag6 = a.addAll(b);
        System.out.println(flag6);
        for (String str : a) {
            System.out.println(str);
        }
        //交集操作
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        List<String> b1 = new ArrayList<>();
        b1.add("b");
        b1.add("c");
        b1.add("d");
        boolean flag7 = a1.retainAll(b1);
        System.out.println(flag7);
        for (String str : a1) {
            System.out.println(str);
        }
        //差集操作
        List<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");
        List<String> b2 = new ArrayList<>();
        b2.add("b");
        b2.add("c");
        b2.add("d");
        boolean flag8 = a2.removeAll(b2);
        System.out.println(flag8);
        for (String str : a2) {
            System.out.println(str);
        }


    }
}
