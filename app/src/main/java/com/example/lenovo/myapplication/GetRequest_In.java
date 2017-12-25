package com.example.lenovo.myapplication;

import com.example.lenovo.myapplication.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GetRequest_In {
    @GET("ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0")
    Call<Bean> getCall();
}
