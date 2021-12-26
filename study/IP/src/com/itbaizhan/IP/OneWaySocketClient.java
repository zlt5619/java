package com.itbaizhan.IP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OneWaySocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            scanner = new Scanner(System.in);
            //向服务器出传输消息
            pw = new PrintWriter(socket.getOutputStream());
            //创建读取服务端返回的对象
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                //通过键盘输入获取需要向服务端发送的消息
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                if ("exit".equals(str)) {
                    break;
                }
                //读取服务端返回的消息
                String serverinput = br.readLine();
                System.out.println("server return：" + serverinput);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
                socket.close();
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
