package com.itbaizhan.jicheng;

public class TextExtends {
    public static void main(String[] args) {
        Student s=new Student("zlt",170,"electric");
        System.out.println(s.name);
        System.out.println(s instanceof Person);
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("学习");
    }

    public Student(String name,int height,String major) {
        this.major = major;
        this.height= height;
        this.name = name;
    }
}
