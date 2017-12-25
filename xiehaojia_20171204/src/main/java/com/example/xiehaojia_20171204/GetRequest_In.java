package com.example.xiehaojia_20171204;

import com.example.xiehaojia_20171204.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 解浩佳 on 2017/12/4.
 */

public interface GetRequest_In {
    @GET("ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0")
    Call<Bean> getCall();
}
