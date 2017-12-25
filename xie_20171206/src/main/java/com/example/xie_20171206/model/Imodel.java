package com.example.xie_20171206.model;

import com.example.xie_20171206.bean.Bean;

import rx.Observer;

/**
 * Created by lenovo on 2017/12/6.
 */

public interface Imodel {
    //将观察者传（bean）进去
    public void shuju(Observer<Bean> observer);
}