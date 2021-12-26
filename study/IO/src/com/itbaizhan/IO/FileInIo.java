package com.itbaizhan.IO;

import java.io.*;

public class FileInIo {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(new File("D:\\programming\\java\\study\\IO\\source\\a.txt")));
            bw = new BufferedWriter(new FileWriter(new File("D:\\programming\\java\\study\\IO\\source\\c.txt")));
            int i = 1;
            String temp = "";
            while ((temp = br.readLine()) != null) {
                bw.write(i + "、" + temp);
                bw.newLine();
                i++;
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
