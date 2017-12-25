package com.example.xie_20171205;

import com.example.xie_20171205.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface GetRequest_In {
    @GET("?key=71e58b5b2f930eaf1f937407acde08fe&num=10")
    Call<Bean> getCall(@Query("num") int num);
}