package com.example.xie_20171205.persenter;

import android.content.Context;


import com.example.xie_20171205.bean.Bean;
import com.example.xie_20171205.model.Model;
import com.example.xie_20171205.view.Iview;

import rx.Observer;


public class Persenter {
    //定义属性
    Context context;
    Model mm;
    Iview vv;

    public Persenter(Context context, Iview vv) {
        this.context = context;
        this.vv = vv;
        mm=new Model();
    }
    //创建方法
    public void getData(){
        int num=vv.getNum();
        mm.shuju(num,new Observer<Bean>() {
            @Override
            public void onCompleted() {

            }
            @Override
            public void onError(Throwable e) {

            }
            //将bean的值让V层接受
            @Override
            public void onNext(Bean bean) {
                vv.ShowView(bean);
            }
        });
    }


}