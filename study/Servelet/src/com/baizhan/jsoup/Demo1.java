package com.baizhan.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Demo1.class.getClassLoader();
        String path = classLoader.getResource("com/baizhan/schema/student.xml").getPath();
        //解析成Dom树对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取相应元素
        Elements name = document.getElementsByTag("name");
        for (Element e : name) {
            String s = e.text();
            System.out.println(s);
        }
    }
}
