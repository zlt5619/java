package com.itbaizhan.IP;

import java.net.InetSocketAddress;

public class TestInetSocket {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com", 80);
        System.out.println(inetSocketAddress.getAddress().getHostAddress());
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
    }
}
