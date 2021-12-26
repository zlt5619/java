package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            //键盘输入对象
            scanner = new Scanner(System.in);
            // 创建向服务端发送消息的流对象
            pw = new PrintWriter(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String keyInput = scanner.nextLine();
                pw.println(keyInput);
                pw.flush();
                String input = br.readLine();
                System.out.println("服务端说：" + input);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                br.close();
                scanner.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
