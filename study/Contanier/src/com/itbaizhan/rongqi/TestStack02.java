package com.itbaizhan.rongqi;

import java.util.Stack;

public class TestStack02 {
    public void symmetry(String str) {

        Stack<String> stack = new Stack<>();
        //假设修正法
        boolean flag = true;//假设是匹配的
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{') {
                stack.push("}");
            }
            if (c == '[') {
                stack.push("]");
            }
            if (c == '(') {
                stack.push(")");
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty()) {
                    flag = false;
                    break;
                }
                String x = stack.pop();
                if (x.charAt(0) != c) {
                    flag = false;
                    break;
                }
            }
        }
        if (!stack.empty()) {
            //修正处理
            flag = false;
        }
        if (flag) {
            System.out.println("str语句是对称的");
        } else {
            System.out.println("str语句不是对称的");
        }
    }

    public static void main(String[] args) {
        //判断元素的对称性
        String str = "...{.....[....(....)...]....}..((....)..[...].(.).)";
        TestStack02 t = new TestStack02();
        t.symmetry(str);

    }
}
