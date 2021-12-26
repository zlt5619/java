package com.itbaizhan.IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        //返回当前计算机的 IP 地址
        System.out.println(inetAddress.getHostAddress());
        // 返回当前计算机名
        System.out.println(inetAddress.getHostName());
        System.out.println();
        InetAddress inetAddress1 = InetAddress.getByName("www.sina.com");
        //getByName方法访问DNS服务器
        System.out.println(inetAddress1.getHostAddress());
        System.out.println(inetAddress1.getHostName());
        System.out.println();
        //通过IP地址获取计算机信息
        InetAddress inetAddress3 = InetAddress.getByName("58.49.198.248");
        System.out.println(inetAddress3.getHostAddress());
        System.out.println(inetAddress3.getHostName());

    }
}
