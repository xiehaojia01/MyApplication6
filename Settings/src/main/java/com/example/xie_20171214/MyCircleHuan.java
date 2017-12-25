package com.example.xie_20171214;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lenovo on 2017/12/21.
 */

public class MyCircleHuan extends View {
    private Paint mPaint;           //画笔
    private int roundColor;         //圆环的颜色
    private int roundProgressColor; //圆环进度的颜色
    private float roundWidth;       //圆环的宽度
    private int textColor;          //中间的字体的颜色
    private float textSize;         //中间字体的大小

    private int progress;           //当前进度

    //构造器
    public MyCircleHuan(Context context) {
        this(context, null);
    }

    public MyCircleHuan(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyCircleHuan(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //获取自定义属性集合
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.MyCircle);
        //获取自定义属性或者默认值
        roundColor = mTypedArray.getColor(R.styleable.MyCircle_roundColor, Color.RED);
        roundProgressColor = mTypedArray.getColor(R.styleable.MyCircle_roundProgressColor, Color.BLACK);
        roundWidth = mTypedArray.getDimension(R.styleable.MyCircle_roundWidth, 10);
        textColor = mTypedArray.getColor(R.styleable.MyCircle_textColor, Color.argb(255, 255, 0, 255));
        textSize = mTypedArray.getDimension(R.styleable.MyCircle_textSize, 20.0f);
        //将TypeArray回收
        mTypedArray.recycle();
        //初始化画笔
        initPaint();
    }

    //初始化画笔
    private void initPaint() {
        mPaint = new Paint();
        //设置画笔风格
        mPaint.setStyle(Paint.Style.STROKE);  //空心
        mPaint.setAntiAlias(true);            //抗锯齿
    }
    //绘制View  重写onDraw()方法

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //背景圆环
        int center = getWidth() / 2;                    //圆心
        int radius = (int) (center - roundWidth / 2);    //半径
        mPaint.setColor(roundColor);                //设置颜色
        mPaint.setStrokeWidth(roundWidth);          //设置圆环的宽度
        canvas.drawCircle(center, center, radius, mPaint); //控制画布画出圆环

        //显示进度
        mPaint.setColor(textColor);                 //设置字体颜色
        mPaint.setStrokeWidth(0);                   //宽度
        mPaint.setTextSize(textSize);               //字体大小
        mPaint.setTypeface(Typeface.DEFAULT);       //默认字体
        int percent = (int) (((float) progress / (float) 100) * 100);  //中间的进度百分比
        float textWidth = mPaint.measureText(percent + "%");   //测量字体宽度
        //显示进度
        if (percent != 0) {
            canvas.drawText(percent + "%", center - textWidth / 2, center + textSize / 2, mPaint);//画出字体
        }
        //为0时,显示0
        else {
            canvas.drawText("0%", center - textWidth / 2, center + textSize / 2, mPaint);//画出字体
        }
       // float textWidth = mPaint.measureText("78%");   //测量字体宽度
        //显示进度
        canvas.drawText("", center - textWidth / 2, center + textSize / 2, mPaint);//画出字体

        //进度条
        mPaint.setStrokeWidth(roundWidth);              //进度条的宽度
        mPaint.setColor(roundProgressColor);            //进度条的颜色
        //画进度条的区域
        RectF rectF = new RectF(center - radius, center - radius, center + radius, center + radius);
        mPaint.setStyle(Paint.Style.STROKE);            //空心
        canvas.drawArc(rectF, 0, 360 * progress / 100, false, mPaint);//绘制圆弧
    }
    /*暴露出的方法*/

    //设置当前进度
    public void setProgress(int progress)
    {
        if(progress>100||progress<0)
        {
            //默认等于100
            this.progress=100;
            return;
            //或者抛异常
            //throw new IllegalArgumentException("进度必须在0-100之间");
        }
        this.progress=progress;
        //通知重绘
        this.postInvalidate();
    }
    //设置背景圆环的颜色
    public void setRoundColor(int color)
    {
        this.roundColor=color;
        //通知重绘
        this.postInvalidate();
    }
    //设置进度条的颜色
    public void setRoundProgressColor(int color)
    {
        this.roundProgressColor=color;
        //通知重绘
        this.postInvalidate();
    }
}
