package com.example.lenovo.myapplication.model;

import com.example.lenovo.myapplication.bean.Bean;

import rx.Observer;

/**
 * Created by Administrator on 2017/12/1.
 */

public interface Imodel {
    //将观察者传（bean）进去
    public void shuju(Observer<Bean> observer);
}
