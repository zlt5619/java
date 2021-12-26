package com.itbaizhan.IO;

import java.io.FileInputStream;

public class Test02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\programming\\java\\study\\IO\\source\\a.txt");
            int temp = 0;
            StringBuilder sb = new StringBuilder();
            while ((temp = fileInputStream.read()) != -1) {
                System.out.println(temp);
                sb.append((char) temp);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
