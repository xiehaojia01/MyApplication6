package com.example.huayuan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button change_btn,start_btn,restart_btn;
    private MyCircleHuan myCircleHuan;

    private int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
    }
    //初始化控件
    private void initView() {
        change_btn= (Button) findViewById(R.id.main_changeRoundColorBtn);
        start_btn= (Button) findViewById(R.id.main_startProgress);
        restart_btn= (Button) findViewById(R.id.main_restart);
        myCircleHuan= (MyCircleHuan) findViewById(R.id.main_mycircle);

        //添加点击事件
        change_btn.setOnClickListener(this);
        start_btn.setOnClickListener(this);
        restart_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Timer timer=new Timer();
        switch (view.getId())
        {
            case R.id.main_changeRoundColorBtn:
                myCircleHuan.setRoundColor(Color.argb(127,255,0,0));
                break;
            case R.id.main_startProgress:
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        progress+=3;
                        myCircleHuan.setProgress(progress);
                        if(progress==99)
                        {
                            myCircleHuan.setProgress(100);
                            this.cancel();      //Timer结束
                        }
                    }
                },0,1000);
                break;
            case R.id.main_restart:
                timer.cancel();
                progress=0;
                myCircleHuan.setProgress(0);
                myCircleHuan.setRoundColor(Color.GRAY);
                break;
        }
    }
}