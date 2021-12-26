package com.itbaizhan.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("d:/sxt.txt"));
            User user = new User(1, "oldlu", "18");
            oos.writeObject(user);
            oos.flush();
            ois = new ObjectInputStream(new FileInputStream("d:/sxt.txt"));
            User users = (User) ois.readObject();
            System.out.println(users.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
