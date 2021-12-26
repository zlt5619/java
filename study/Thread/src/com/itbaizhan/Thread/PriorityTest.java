package com.itbaizhan.Thread;

public class PriorityTest {
    public static void main(String[] args) {
        Thread t = new Thread();
        int i = t.getPriority();
        System.out.println(i);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());

    }
}
