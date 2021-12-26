package com.itbaizhan.IP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        byte[] b = "zlt".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(b, b.length, new InetSocketAddress("127.0.0.1", 9999));
        try {
            //指定消息的发送端口
            datagramSocket = new DatagramSocket(8888);
            datagramSocket.send(datagramPacket);
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
