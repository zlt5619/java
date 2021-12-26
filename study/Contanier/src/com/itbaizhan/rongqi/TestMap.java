package com.itbaizhan.rongqi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("a", "A");
        System.out.println(m.get("a"));
        String value = m.put("a", "B");
        System.out.println("-----");
        System.out.println(value);
        System.out.println(m.get("a"));
        System.out.println("-----");

        //获取元素
        String v = m.get("a");
        //获取 HashMap 容器中所有的元素，可以使用 keySet 方法与 get 方法一并完成
        m.put("b", "B");
        Set<String> keys = m.keySet();
        System.out.println(keys);
        //通过 entrySet 方法获取 Map.Entry 类型获取元素
        Set<Map.Entry<String, String>> entrySet = m.entrySet();
        System.out.println(entrySet);
        for (Map.Entry<String, String> s : entrySet) {
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }
        System.out.println("-----");
        //并集处理
        Map<String, String> m2 = new HashMap<>();
        m2.put("a", "A");
        m2.put("z", "Z");
        m.putAll(m2);
        System.out.println(m.keySet());

        //删除元素
        System.out.println("-----");
        m.remove("b");
        System.out.println(m.keySet());

        //判断 key 或 value 是否存在
        System.out.println("-----");
        System.out.println(m.containsKey("b"));
        System.out.println(m.containsValue("Z"));


    }

}
