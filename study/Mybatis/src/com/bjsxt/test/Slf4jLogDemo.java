package com.bjsxt.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogDemo {
    private static final Logger logger= LoggerFactory.getLogger(Slf4jLogDemo.class);

    public static void main(String[] args) {
        String str="SLF4j";
        logger.debug(str);
        try{
            String temp=null;
            temp.length();
        }catch (Exception e){
            logger.debug("aaa",e);
            logger.error("abc",e);
        }
    }
}
