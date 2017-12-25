package com.example.xiehaojia_20171219.model;

import com.example.xiehaojia_20171219.bean.CartBean;
import com.example.xiehaojia_20171219.net.OnNetListenner;

import java.util.Map;

/**
 * Created by on 2017/12/19.
 */

public interface IShopCart_M {
    void doGetCartBean(OnNetListenner<CartBean> onNetListenner);
}