package com.example.xiehaojia_20171211.net;

/**
 * Created by 解浩佳 on 2017/12/11.
 */

public interface OnNetListenner<T> {
    void doChengGong(T t);

    void doShiBai(Exception e);
}
