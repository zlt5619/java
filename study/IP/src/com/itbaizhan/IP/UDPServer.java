package com.itbaizhan.IP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(9999);
            //创建数据缓存区
            byte[] b = new byte[1024];
            //创建数据报包对象
            DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
            //等待客户端发送数据
            datagramSocket.receive(datagramPacket);
            String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                datagramSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
