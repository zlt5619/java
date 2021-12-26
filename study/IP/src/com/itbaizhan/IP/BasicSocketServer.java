package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicSocketServer {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        try {
            ServerSocket serversocket = new ServerSocket(8888);
            System.out.println(" server start and listen");
            //开启监听
            socket = serversocket.accept();
            //读取客户端发送的消息
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
