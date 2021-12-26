package com.itbaizhan.IO;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader frd = null;
        try {
            frd = new FileReader("D:\\programming\\java\\study\\IO\\source\\a.txt");
            int temp = 0;
            while ((temp = frd.read()) != -1) {
//                System.out.println((char) temp);
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (frd != null) {
                    frd.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
