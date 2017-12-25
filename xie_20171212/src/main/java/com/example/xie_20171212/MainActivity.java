package com.example.xie_20171212;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xie_20171212.presenter.LoginActivityPresenter;
import com.example.xie_20171212.view.LoginActivityViewListener;

public class MainActivity extends AppCompatActivity implements LoginActivityViewListener {

    private EditText mZhangahoMain;
    private EditText mMimaMian;
    private LoginActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginActivityPresenter(this);
        initView();
    }

    private void initView() {
        mZhangahoMain = (EditText) findViewById(R.id.main_zhangaho);
        mMimaMian = (EditText) findViewById(R.id.mian_mima);
    }

    public void main_login(View view){
        if(mZhangahoMain != null && mMimaMian != null){
            if(mZhangahoMain.length() != 11){
                Toast.makeText(this, "请输入是一位手机号", Toast.LENGTH_SHORT).show();
            }else{
                MyLogin();
            }
        }
    }

    private void MyLogin() {

        presenter.login(mZhangahoMain.getText().toString().trim(),mMimaMian.getText().toString().trim());
        System.out.println(mZhangahoMain+"===="+mMimaMian);
        success(this);
    }
    public void main_zhuce(View view){
        startActivity(new Intent(MainActivity.this,ZhuCeActivity.class));
    }

    @Override
    public void success(Object object) {
        // Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onfailed() {

    }
}