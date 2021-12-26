package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Msg extends Thread {
    private Socket socket;

    public Msg(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.msg();
    }

    private void msg() {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            pw = new PrintWriter(this.socket.getOutputStream());
            while (true) {
                pw.println(br.readLine() + "--server");
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class EchoServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                new Msg(socket).start();
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
