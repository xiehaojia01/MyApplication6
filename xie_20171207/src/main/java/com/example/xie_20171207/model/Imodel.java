package com.example.xie_20171207.model;


import com.example.xie_20171207.bean.Bean;

import rx.Observer;

public interface Imodel {
    //将观察者传（bean）进去
    public void shuju(int num,Observer<Bean> observer);
}
