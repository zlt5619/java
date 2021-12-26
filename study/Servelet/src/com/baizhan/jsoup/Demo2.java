package com.baizhan.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.parse(new URL("https://www.baidu.com"), 5000);
        System.out.println(document);
    }
}
