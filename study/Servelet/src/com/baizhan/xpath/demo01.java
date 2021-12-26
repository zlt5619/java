package com.baizhan.xpath;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;

public class demo01 {
    public static void main(String[] args) throws Exception {
        Document document = Jsoup.parse(new URL("https://daily.zhihu.com/story/9743737"), 5000);

        Elements headImg = document.getElementsByAttributeValue("alt", "头图");
        Elements header = document.select(".DailyHeader-title");
        Elements author = document.select(".author");
        Elements content = document.select(".content");
        System.out.println(headImg);
        System.out.println(header);
        System.out.println(author);
        System.out.println(content);
    }
}
