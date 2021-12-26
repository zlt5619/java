package com.itbaizhan.IO;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\programming\\java\\study\\IO\\source\\b.txt")));
            dos.writeChar('a');
            dos.writeInt(10);
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            dos.writeUTF("你好尚学堂");
            dos.flush();
            //直接读取数据，注意：读取的顺序要与写入的顺序一致，否则不能正确读取数据。
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\programming\\java\\study\\IO\\source\\b.txt")));
            System.out.println("char:" + dis.readChar());
            System.out.println("int:" + dis.readInt());
            System.out.println("Double:" + dis.readDouble());
            System.out.println("Boolean:" + dis.readBoolean());
            System.out.println("UTF:" + dis.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
                dis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
