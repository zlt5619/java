package com.itbaizhan.shuzu;

public class Test02 {
    public static void main(String[] args) {
        Man[] mans;
        mans = new Man[5];
        Man m1 = new Man();
        m1.setAge(18);
        m1.setName("zlt");
        mans[0] = m1;
        System.out.println(mans[0].getAge());
        System.out.println(mans[0].getName());
        int[] a = {1, 2, 3};
        System.out.println(a.length);

    }
}

class Man {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
