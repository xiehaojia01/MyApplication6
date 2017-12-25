package com.example.xiehaojia_20171219.net;

/**
 * Created by lenovo on 2017/12/19.
 */
import java.io.File;
import java.util.Map;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class MyOkHttpUtil {
    private static MyOkHttpUtil okHttpUtil;
    private final OkHttpClient client;

    private MyOkHttpUtil() {
        client = new OkHttpClient.Builder()
                .build();
    }

    public static MyOkHttpUtil getOkHttpUtil() {
        if (okHttpUtil == null) {
            synchronized (MyOkHttpUtil.class) {
                if (okHttpUtil == null) {
                    okHttpUtil = new MyOkHttpUtil();
                }
            }
        }
        return okHttpUtil;
    }

    public void doGet(String url, Callback callback) {
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

    public void doPost(String url, Callback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        RequestBody body = builder.build();
        Request request = new Request.Builder().url(url).post(body).build();
        client.newCall(request).enqueue(callback);
    }

    public void loadFile(String url, File file, String fileName, Callback callback) {
        //设置文件类型
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
        //设置请求体
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("image", fileName, requestBody)
                .build();
        //请求方式
        Request request = new Request.Builder().url(url).post(body).build();
        client.newCall(request).enqueue(callback);
    }

    public void doDown(String url,Callback callback){
        Request build = new Request.Builder().url(url).build();
        client.newCall(build).enqueue(callback);
    }



}