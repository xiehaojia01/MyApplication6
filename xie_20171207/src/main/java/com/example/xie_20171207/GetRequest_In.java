package com.example.xie_20171207;

import com.example.xie_20171207.bean.Bean;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
/**
 * Created by lenovo on 2017/12/7.
 */

public interface GetRequest_In {
    @GET("?key=71e58b5b2f930eaf1f937407acde08fe&num=10")
    Call<Bean> getCall(@Query("num") int num);
}
