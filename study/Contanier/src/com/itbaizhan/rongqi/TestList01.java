package com.itbaizhan.rongqi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
产生 1-10 之间的随机数([1,10]闭区间)，将不重复的 10 个随机数放到容器中
 */
public class TestList01 {
    public static void main(String[] args) {
        //使用list实现
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (true) {
            count++;
            int i = (int) (Math.random() * 10 + 1);
            if (!list.contains(i)) {
                list.add(i);
            }
            if (list.size() == 10) {

                break;

            }
        }
        for (int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println("使用了：" + count + "次");

        //使用set实现
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int i = (int) (Math.random() * 10 + 1);
            set.add(i);
            if (set.size() == 10) {
                break;
            }
        }
        for (int i : set) {
            System.out.print(i + "\t");
        }

    }
}

