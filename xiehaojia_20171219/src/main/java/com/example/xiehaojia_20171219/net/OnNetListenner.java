package com.example.xiehaojia_20171219.net;

/**
 * Created by lenovo on 2017/12/19.
 */

public interface OnNetListenner<T> {
    void doChengGong(T t);

    void doShiBai(Exception e);
}