package com.itbaizhan.IP;

import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&rsv_idx=1&tn=ba idu&wd=itbz");
        //https   端口是443
        //        URL url = new URL("http://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&rsv_idx=1&tn=ba idu&wd=itbz");
        //http  端口是80
        System.out.println("获取与此 URL 相关联协议的默认端口： " + url.getDefaultPort());
        System.out.println("访问资源：" + url.getFile());
        System.out.println("主机名:" + url.getHost());
        System.out.println("访问资源路径：" + url.getPath());
        System.out.println("协议：" + url.getProtocol());
        System.out.println("参数部分：" + url.getQuery());
    }
}
