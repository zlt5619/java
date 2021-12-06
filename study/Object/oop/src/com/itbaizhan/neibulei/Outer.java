package com.itbaizhan.neibulei;

public class Outer {
    private int age=10;
    public void show(){
        System.out.println("Outer show");
        System.out.println(age);
    }

    public class Inner{
        int age=20;
        public void show(){
            System.out.println("Inner show");
            System.out.println(age);
            System.out.println(this.age);//访问内部类的属性
            System.out.println(Outer.this.age);//访问外部类的属性
            Outer.this.show();
        }
    }

}
