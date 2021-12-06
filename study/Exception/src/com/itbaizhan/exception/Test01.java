package com.itbaizhan.exception;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
虚拟机JVM调操作系统os，读取文件
当java文件关闭，需要通知操作系统关闭操作流
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try{
            reader=new FileReader("D:\\programming\\java\\study\\Exception\\src\\com\\itbaizhan\\exception\\a.txt");
            char c1=(char) reader.read();
            char c2=(char) reader.read();
            char c3=(char) reader.read();
            System.out.println(""+c1+c2+c3);
            char c4=(char) reader.read();
            char c5=(char) reader.read();
            System.out.println(""+c1+c2+c3+c4);
            System.out.println(""+c1+c2+c3+c4+c5);


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }


        }
    }
}
