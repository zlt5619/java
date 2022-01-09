package com.bjsxt.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 使用commons-logging和log4j一起使用
 */
public class CommonsLogDemo {
    //使用commons包的log
    private static final Log log= LogFactory.getLog(CommonsLogDemo.class);

    public static void main(String[] args) {
        log.debug("commons-logging");
        try{
            String temp=null;
            temp.length();
        }catch (Exception e){
            log.debug(e);
            log.error("sfgfefw",e);
        }
    }
}
