package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader br = null;
        Scanner scanner = null;
        PrintWriter pw = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("server start and listen");
            socket = serverSocket.accept();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            scanner = new Scanner(System.in);
            pw = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = br.readLine();
                System.out.println("client say ：" + str);
                String input = scanner.nextLine();
                pw.println(input);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                scanner.close();
                br.close();
                socket.close();
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
