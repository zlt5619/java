package com.bjsxt.test;

import org.apache.log4j.Logger;

public class LogDemo {
    private  final static Logger logger=Logger.getLogger(LogDemo.class);
    public static void main(String[] args) {
        String str="Bjsxt";
        logger.debug(str);
        try{
            String temp=null;
            temp.length();
        }catch (Exception e){
            logger.debug(e);
            logger.error(e);
        }
    }
}
