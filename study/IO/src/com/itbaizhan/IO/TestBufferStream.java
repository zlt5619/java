package com.itbaizhan.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileInputStream = new FileInputStream("D:\\programming\\java\\study\\IO\\source\\sxt.jpg");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream("D:\\programming\\java\\study\\IO\\source\\sxt2.jpg");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int temp = 0;
            while ((temp = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(temp);
            }
            bufferedOutputStream.flush();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            //有多个流对象，需要关闭时，后开的流对象，先关闭
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    }
}
