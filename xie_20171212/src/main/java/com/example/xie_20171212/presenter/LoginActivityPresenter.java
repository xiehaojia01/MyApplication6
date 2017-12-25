package com.example.xie_20171212.presenter;

import com.example.xie_20171212.model.LoginActivityModel;
import com.example.xie_20171212.model.LoginActivityModelListener;
import com.example.xie_20171212.view.LoginActivityViewListener;

/**
 * Created by 解浩佳 on 2017/12/12.
 */

public class LoginActivityPresenter {

    private LoginActivityViewListener listener ;
    private LoginActivityModel model;
    public LoginActivityPresenter(LoginActivityViewListener loginActivityViewListener){

        this.listener = loginActivityViewListener;
        this.model = new LoginActivityModel();

    }
    public void login(String username,String password){

        // 空判断 合法性
        model.login(username, password, new LoginActivityModelListener() {
            @Override
            public void success(Object object) {
                listener.success(object);
            }

            @Override
            public void onfailed() {
                listener.onfailed();
            }
        });


    }

}