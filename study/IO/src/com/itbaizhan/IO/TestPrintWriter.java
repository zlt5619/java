package com.itbaizhan.IO;

import java.io.*;

public class TestPrintWriter {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\programming\\java\\study\\IO\\source\\a.txt")));
            pw = new PrintWriter("d:/sxt.txt");
            String temp = "";
            while ((temp = br.readLine()) != null) {
                pw.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
