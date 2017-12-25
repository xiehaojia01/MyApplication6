package com.example.xiehaojia_20171211.eventbusevent;

/**
 * Created by 解浩佳 on 2017/12/11.
 */

public class PriceAndCountEvent {
    private int price;
    private int count;

    public PriceAndCountEvent(int price, int count) {
        this.price = price;
        this.count = count;
    }

    public PriceAndCountEvent() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
