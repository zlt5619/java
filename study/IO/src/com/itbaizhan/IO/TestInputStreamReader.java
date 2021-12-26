package com.itbaizhan.IO;

import java.io.*;

public class TestInputStreamReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true) {
                bw.write("请输入，当输入exit，退出\n");
                String input = br.readLine();
                if ("exit".equals(input)) {
                    break;
                }
                bw.write(input);
                bw.newLine();
                bw.flush();

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
