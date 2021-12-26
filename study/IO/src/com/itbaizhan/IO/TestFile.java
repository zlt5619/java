package com.itbaizhan.IO;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File f = new File("D:\\programming\\java\\study\\IO\\source\\b.txt");
        Boolean flag = f.createNewFile();
        System.out.println(flag);
        System.out.println(f.exists());
        System.out.println(f.delete());
        System.out.println(f.exists());
        f = new File("D:\\programming\\java\\study\\IO\\source\\b");
        f.mkdir();
    }
}
