package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutionException;

class ChatReceive extends Thread {
    private Socket socket;

    public ChatReceive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.receiveMsg();
    }

    private void receiveMsg() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            while (true) {
                String msg = br.readLine();
                //同步锁定线程
                synchronized ("aaa") {
                    ChatRoomServer.buf = this.socket.getInetAddress() + ":" + msg;
                    //唤醒发送消息的线程对象
                    "aaa".notifyAll();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                this.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class ChatSend extends Thread {
    private Socket socket;

    public ChatSend(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(this.socket.getOutputStream());
            while (true) {
                synchronized ("aaa") {
                    //让发送消息的线程处于等待状态
                    "aaa".wait();
                    //读取公共数据区，再发送数据
                    String msg = ChatRoomServer.buf;
                    pw.println(msg);
                    pw.flush();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                this.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ChatRoomServer {
    //定义公共数据区
    static String buf;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        System.out.println("server start");
        try {
            serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                new ChatReceive(socket).start();
                new ChatSend(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
