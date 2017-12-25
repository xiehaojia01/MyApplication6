package com.example.xiehaojia_20171219.model;

/**
 * Created by 解浩佳 on 2017/12/19.
 */


import android.util.Log;
import android.widget.Toast;

import com.example.xiehaojia_20171219.bean.CartBean;
import com.example.xiehaojia_20171219.net.API;
import com.example.xiehaojia_20171219.net.MyOkHttpUtil;
import com.example.xiehaojia_20171219.net.OnNetListenner;
import com.google.gson.Gson;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class ShopCart_M implements IShopCart_M {
    @Override
    public void doGetCartBean(final OnNetListenner<CartBean> onNetListenner) {
        MyOkHttpUtil.getOkHttpUtil().doPost(API.CARTS,new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onNetListenner.doShiBai(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                Gson gson=new Gson();
                CartBean cartBean = gson.fromJson(json, CartBean.class);
                onNetListenner.doChengGong(cartBean);
            }
        });
    }
}