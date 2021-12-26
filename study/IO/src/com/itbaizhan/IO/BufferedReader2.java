package com.itbaizhan.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReader2 {
    public static void main(String[] args) {
        //通过字符缓冲流实现文本文件的拷贝


    }

    public static void copyFile(String src, String des) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(src));
            bw = new BufferedWriter(new FileWriter(des));
            String temp = "";
            while ((temp = br.readLine()) != null) {
                bw.write(temp);
                //做换行处理
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
