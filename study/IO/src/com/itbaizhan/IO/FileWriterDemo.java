package com.itbaizhan.IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fwd = null;
        FileWriter fw2 = null;
        try {
            fwd = new FileWriter("D:\\programming\\java\\study\\IO\\source\\sxt.txt");
            fwd.write("你好，尚学堂\r\n");
            fwd.write("Hello World");
            fwd.flush();
            //需要添加true，才是在后面接着添加
            fw2 = new FileWriter("D:\\programming\\java\\study\\IO\\source\\sxt.txt", true);
            fw2.write("何以解忧\r\n 唯有尚学堂");
            fw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fwd != null) {
                    fwd.close();
                }
                if (fw2 != null) {
                    fw2.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
