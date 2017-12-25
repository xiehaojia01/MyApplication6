package com.example.xiehaojia_20171211.presenter;

import com.example.xiehaojia_20171211.bean.CartBean;
import com.example.xiehaojia_20171211.model.ShopCart_M;
import com.example.xiehaojia_20171211.net.OnNetListenner;
import com.example.xiehaojia_20171211.view.IShopCart_V;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 解浩佳 on 2017/12/11.
 */

public class ShopCart_P {
    private IShopCart_V shopCartV;
    private final ShopCart_M shopCartM;

    public ShopCart_P(IShopCart_V shopCartV) {
        shopCartM = new ShopCart_M();
        this.shopCartV = shopCartV;
    }
    public void doGetCartBean(){
        Map<String,String> map=new HashMap<>();
        map.put("uid","71");
        shopCartM.doGetCartBean(map, new OnNetListenner<CartBean>() {
            @Override
            public void doChengGong(CartBean cartBean) {
                shopCartV.setCartBean(cartBean);
            }

            @Override
            public void doShiBai(Exception e) {
                e.printStackTrace();
            }
        });
    }
}
