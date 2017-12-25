package com.example.lenovo.myapplication.presenter;

import android.content.Context;

import com.example.lenovo.myapplication.bean.Bean;
import com.example.lenovo.myapplication.model.Model;
import com.example.lenovo.myapplication.view.Iview;

import rx.Observer;

/**
 * Created by Administrator on 2017/12/1.
 */

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
        mm.shuju(new Observer<Bean>() {
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
