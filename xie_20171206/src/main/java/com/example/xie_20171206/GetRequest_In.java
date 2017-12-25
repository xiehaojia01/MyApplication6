package com.example.xie_20171206;

import com.example.xie_20171206.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lenovo on 2017/12/6.
 */

public interface GetRequest_In {
    @GET("?key=71e58b5b2f930eaf1f937407acde08fe&num=10")
    Call<Bean> getCall();
}