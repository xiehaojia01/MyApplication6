package com.example.xiehaojia_20171219.presenter;

import com.example.xiehaojia_20171219.bean.CartBean;
import com.example.xiehaojia_20171219.model.ShopCart_M;
import com.example.xiehaojia_20171219.net.OnNetListenner;
import com.example.xiehaojia_20171219.view.IShopCart_V;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public class ShopCart_P implements IDataPresenter<IShopCart_V>{
    private IShopCart_V shopCartV;
    private final ShopCart_M shopCartM;

    private SoftReference<IShopCart_V> shopCart_vSoftReference;

    public ShopCart_P(IShopCart_V shopCartV) {
        shopCartM = new ShopCart_M();
        attach(shopCartV);
    }

    public void doGetCartBean() {
        Map<String, String> map = new HashMap<>();
        map.put("uid", "71");
        shopCartM.doGetCartBean(new OnNetListenner<CartBean>() {
            @Override
            public void doChengGong(CartBean cartBean) {
                shopCart_vSoftReference.get().setCartBean(cartBean );
            }

            @Override
            public void doShiBai(Exception e) {
                e.printStackTrace();
            }
        });
    }

    //绑定
    @Override
    public void attach(IShopCart_V view) {
        shopCart_vSoftReference=new SoftReference<IShopCart_V>(view);
    }
    //解绑
    @Override
    public void detach() {
        shopCart_vSoftReference.clear();
    }
}