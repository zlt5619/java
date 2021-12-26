package com.itbaizhan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        fileInputStream = new FileInputStream("D:\\programming\\java\\study\\IO\\source\\sxt.jpg");
        fileOutputStream = new FileOutputStream("D:\\programming\\java\\study\\IO\\source\\sxt2.jpg");
        //最开始的做法
        //        int temp;
//        int num=0;
//        while((temp = fileInputStream.read()) != -1){
//            num+=1;
//            fileOutputStream.write(temp);
//        }

        //创建一个缓冲区，提高读写效率
        byte[] buff = new byte[1024];
        int temp = 0;
        while ((temp = fileInputStream.read(buff)) != -1) {
            fileOutputStream.write(buff, 0, temp);
        }
        //将数据从内存中写入到磁盘中。
        fileOutputStream.flush();

        //创建一个缓冲区，提高读写效率
        //通过available()方法，预估缓存区的大小
        // byte[] buff = new byte[fis.available()];
        // fis.read(buff);
        //将数据从内存中写入到磁盘中。
        // fos.write(buff);
        // fos.flush();

//        System.out.println(num);
        fileInputStream.close();
        fileOutputStream.close();


    }
}
