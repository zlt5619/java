package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class Send02 extends Thread {
    private Socket socket;

    public Send02(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg() {
        Scanner scanner = null;
        PrintWriter pw = null;
        try {
            scanner = new Scanner(System.in);
            pw = new PrintWriter(this.socket.getOutputStream());
            while (true) {
                String msg = scanner.nextLine();
                pw.println(msg);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                scanner.close();
                pw.close();
                this.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class Recv02 extends Thread {
    private Socket socket;

    public Recv02(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.recvMsg();
    }

    private void recvMsg() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            while (true) {
                String msg = br.readLine();
                System.out.println("server say ：" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ChatSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            System.out.println("连接成功！");
            new Send02(socket).start();
            new Recv02(socket).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
