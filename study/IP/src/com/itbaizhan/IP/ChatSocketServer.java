package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Send extends Thread {
    private Socket socket;

    public Send(Socket socket) {
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

class Recv extends Thread {
    private Socket socket;

    public Recv(Socket socket) {
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
                System.out.println("client say ：" + msg);
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

public class ChatSocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            System.out.println("strat server");
            serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            System.out.println("connection success");
            new Send(socket).start();
            new Recv(socket).start();
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
