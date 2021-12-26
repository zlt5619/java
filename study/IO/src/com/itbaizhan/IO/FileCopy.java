package com.itbaizhan.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        //调用copyFile方法
        //copyFile(str1,str2);

    }

    //文件拷贝方法
    public static void copyFile(String inputfilepath1, String outputfilepath2) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(inputfilepath1));
            bos = new BufferedOutputStream(new FileOutputStream(outputfilepath2));
            int temp = 0;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}
