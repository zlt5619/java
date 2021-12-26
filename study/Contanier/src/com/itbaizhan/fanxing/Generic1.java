package com.itbaizhan.fanxing;

/*
给定上限限定
 */
public class Generic1<T extends Number> {
    private T flag;

    public T getFlag() {
        return flag;
    }

    public void setFlag(T flag) {
        this.flag = flag;
    }
}
