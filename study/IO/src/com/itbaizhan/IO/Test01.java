package com.itbaizhan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        //创建输入流对象
        FileInputStream fis = null;

        {
            try {
                fis = new FileInputStream("D:\\programming\\java\\study\\IO\\source\\a.txt");
                //打印输入字符A对应的ascii码
                int s1 = fis.read();
                int s2 = fis.read();
                int s3 = fis.read();
                int s4 = fis.read();  //读取完毕，返回-1
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
