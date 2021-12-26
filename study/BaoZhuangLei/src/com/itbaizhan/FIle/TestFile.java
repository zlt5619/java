package com.itbaizhan.FIle;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("a.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f2 = new File("d://b.txt");
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File 是否存在：" + f.exists());
        System.out.println("File 是否是目录：" + f.isDirectory());
        System.out.println("File 是否是文件：" + f.isFile());
        System.out.println("File 最后修改时间：" + new Date(f.lastModified()));
        System.out.println("File 的大小：" + f.length());
        System.out.println("File 的文件名：" + f.getName());
        System.out.println("File 的目录路径：" + f.getAbsolutePath());

        File f4 = new File("d://电影//华语//大陆");
        boolean flag = f4.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败

    }
}
