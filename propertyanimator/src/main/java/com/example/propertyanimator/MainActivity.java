package com.example.propertyanimator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button_alpha);
        button2=(Button)findViewById(R.id.button_rotate);
        button3=(Button)findViewById(R.id.button_scale);
        button4=(Button)findViewById(R.id.button_translate);
        button5=(Button)findViewById(R.id.button_alpha_translate);
        imageView=(ImageView)findViewById(R.id.imageview);
        button1.setOnClickListener(new MyButton());
        button2.setOnClickListener(new MyButton());
        button3.setOnClickListener(new MyButton());
        button4.setOnClickListener(new MyButton());
        button5.setOnClickListener(new MyButton());
    }
    class MyButton implements View.OnClickListener {
        @Override
        public void onClick(View arg0) {
// TODO Auto-generated method stub
            switch (arg0.getId()) {
                case R.id.button_alpha:
                    Alpha();
                    break;
                case R.id.button_rotate:
                    Rotata();
                    break;
                case R.id.button_scale:
                    Scale();
                    break;
                case R.id.button_translate:
                    Translate();
                    break;
                case R.id.button_alpha_translate:
                    Alpha_Translate();
                    break;
                default:
                    break;
            }
        }

    }
    public void Alpha() {
        AnimationSet animationSet=new AnimationSet(true);
        AlphaAnimation alphaAnimation=new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(2000);
        animationSet.addAnimation(alphaAnimation);
        imageView.startAnimation(animationSet);
    }
    public void Rotata(){
        AnimationSet animationSet=new AnimationSet(true);
//后面的四个参数定义的是旋转的圆心位置
        RotateAnimation rotateAnimation=new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_PARENT, 1f,
                Animation.RELATIVE_TO_PARENT, 0f);
        rotateAnimation.setDuration(2000);
        animationSet.addAnimation(rotateAnimation);
        imageView.startAnimation(animationSet);
    }
    public void Scale() {
        AnimationSet animationSet=new AnimationSet(true);
        ScaleAnimation scaleAnimation=new ScaleAnimation(
                1, 0.1f, 1, 0.1f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        animationSet.addAnimation(scaleAnimation);
        imageView.startAnimation(scaleAnimation);
    }
    public void Translate() {
        AnimationSet animationSet=new AnimationSet(true);
        TranslateAnimation translateAnimation=new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f, //X轴的开始位置
                Animation.RELATIVE_TO_SELF, 0.5f, //X轴的结束位置
                Animation.RELATIVE_TO_SELF, 0f, //Y轴的开始位置
                Animation.RELATIVE_TO_SELF, 1.0f); //Y轴的结束位置
        translateAnimation.setDuration(2000);
        animationSet.addAnimation(translateAnimation);

/*
* 第一行的设置如果为true，则动画执行完之后效果定格在执行完之后的状态
* 第二行的设置如果为false，则动画执行完之后效果定格在执行完之后的状态
* 第三行设置的是一个long类型的值，是指动画延迟多少毫秒之后执行
* 第四行定义的是动画重复几次执行
*/
        animationSet.setFillAfter(true);
        animationSet.setFillBefore(false);
        animationSet.setStartOffset(2000);
        animationSet.setRepeatCount(3);

        imageView.startAnimation(animationSet);
    }
    public void Alpha_Translate() {
        AnimationSet animationSet=new AnimationSet(true);
        AlphaAnimation alphaAnimation=new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(2000);
        animationSet.addAnimation(alphaAnimation);
        TranslateAnimation translateAnimation=new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f, //X轴的开始位置
                Animation.RELATIVE_TO_SELF, 0.5f, //X轴的结束位置
                Animation.RELATIVE_TO_SELF, 0f, //Y轴的开始位置
                Animation.RELATIVE_TO_SELF, 1.0f); //Y轴的结束位置
        translateAnimation.setDuration(2000);
        animationSet.addAnimation(translateAnimation);
        imageView.startAnimation(animationSet);
    }


}
