package com.itbaizhan.IP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class OneWaySocketServer {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("server start and listen");
            socket = serverSocket.accept();
            System.out.println("connection success");
            //读取客户端发送的消息
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //向客户端写消息
            pw = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = br.readLine();
                System.out.println("client say:" + str);
                if ("exit".equals(str)) {
                    break;
                }
                pw.println(str);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
