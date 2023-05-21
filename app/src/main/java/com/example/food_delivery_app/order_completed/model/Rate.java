package com.example.food_delivery_app.order_completed.model;

public class Rate {
    private int rateId;
    private int orderId;
    private float rateNum;
    private String content;

    public Rate(int rateId, int orderId, float rateNum, String content) {
        this.rateId = rateId;
        this.orderId = orderId;
        this.rateNum = rateNum;
        this.content = content;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getRateNum() {
        return rateNum;
    }

    public void setRateNum(float rateNum) {
        this.rateNum = rateNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
