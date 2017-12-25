package com.example.xie_201771213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends TitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("标题栏");
        showBackwardView(R.string.text_back,true);
        showForwardView(R.string.text_forward,true);
    }
}
