package com.itbaizhan.IP;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class BasicSocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter pw = null;
        //创建socket对象,给定2个参数，服务端IP地址，服务端端口号
        try {
            socket = new Socket("127.0.0.1", 8888);
            pw = new PrintWriter(socket.getOutputStream());
            pw.println("服务端，你好");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                try {
                    pw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
