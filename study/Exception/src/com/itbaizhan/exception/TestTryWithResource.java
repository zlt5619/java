package com.itbaizhan.exception;

import java.io.FileReader;

/*
try with resource
自动关闭接口类
 */
public class TestTryWithResource {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("d:/a.txt");) {
            char c1 = (char) reader.read();
            char c2 = (char) reader.read();
            char c3 = (char) reader.read();
            System.out.println("" + c1 + c2 + c3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
