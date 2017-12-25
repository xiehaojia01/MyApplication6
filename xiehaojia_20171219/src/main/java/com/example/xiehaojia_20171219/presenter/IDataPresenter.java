package com.example.xiehaojia_20171219.presenter;

import com.example.xiehaojia_20171219.view.IShopCart_V;

/**
 * P层和V层绑定
 */

public interface IDataPresenter<T extends IShopCart_V> {
    //绑定方法
    public void attach(T view);
    //解绑方法
    public void detach();
}
