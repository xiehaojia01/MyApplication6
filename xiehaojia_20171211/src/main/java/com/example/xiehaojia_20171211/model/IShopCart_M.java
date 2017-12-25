package com.example.xiehaojia_20171211.model;

import com.example.xiehaojia_20171211.bean.CartBean;
import com.example.xiehaojia_20171211.net.OnNetListenner;

import java.util.Map;

/**
 * Created by 解浩佳 on 2017/12/11.
 */

public interface IShopCart_M {
    void doGetCartBean(Map<String, String> map, OnNetListenner<CartBean> onNetListenner);
}