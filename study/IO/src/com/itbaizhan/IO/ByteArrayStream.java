package com.itbaizhan.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String[] args) {
        byte[] arr = "abcdefg".getBytes();
        ByteArrayInputStream bis = null;
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream bos = null;
        byte[] arrs = null;
        StringBuilder sb1 = new StringBuilder();
        try {
            bis = new ByteArrayInputStream(arr);
            int temp = 0;
            while ((temp = bis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb);

            bos = new ByteArrayOutputStream();
            bos.write('a');
            bos.write('b');
            bos.write('c');
            arrs = bos.toByteArray();
            for (int i = 0; i < arrs.length; i++) {
                sb1.append((char) arrs[i]);
            }
            System.out.println(sb1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
