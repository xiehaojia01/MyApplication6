package com.example.xiehaojia_20171219.eventbusevent;

/**
 * Created by  on 2017/12/19.
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
