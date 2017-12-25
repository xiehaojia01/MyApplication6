package com.example.xiehaojia_20171204.presenter;

import android.content.Context;

import com.example.xiehaojia_20171204.bean.Bean;
import com.example.xiehaojia_20171204.model.Model;
import com.example.xiehaojia_20171204.view.Iview;

import rx.Observer;

/**
 * Created by 解浩佳 on 2017/12/4.
 */

public class Persenter {
    Context context;
    Model mm;
    Iview vv;

    public Persenter(Context context,  Iview vv) {
        this.context = context;
        this.vv = vv;
        mm=new Model();
    }
    public void getData(){
        mm.shuju(new Observer<Bean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }
            //将bean的值让V层接收
            @Override
            public void onNext(Bean bean) {
                vv.ShowView(bean);
            }
        });
    }
}
