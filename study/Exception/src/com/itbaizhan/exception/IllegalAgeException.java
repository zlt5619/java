package com.itbaizhan.exception;

/*
非法年龄异常，继承Exception类
 */
public class IllegalAgeException extends Exception {
    //默认构造方法
    public IllegalAgeException() {

    }

    //详细构造方法
    public IllegalAgeException(String message) {
        super(message);
    }
}
