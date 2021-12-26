package com.itbaizhan.IO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public class TestApache {
    public static void main(String[] args) throws IOException {
        String s = FileUtils.readFileToString(new File("D:\\programming\\java\\study\\IO\\source\\a.txt"), "utf-8");
        System.out.println(s);
        //FileFilter匿名内部类
        FileUtils.copyDirectory(new File("D:\\programming\\java\\study\\IO\\source"), new File("D:\\"), new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().endsWith("jpg")) {
                    return true;
                }
                return false;
            }
        });
        System.out.println("======================");
        String content = IOUtils.toString(new FileInputStream("D:\\programming\\java\\study\\IO\\source\\a.txt"), "utf-8");
        System.out.println(content);
    }
}
