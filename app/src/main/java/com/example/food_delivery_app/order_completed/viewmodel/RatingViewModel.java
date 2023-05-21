package com.example.food_delivery_app.order_completed.viewmodel;

import androidx.lifecycle.ViewModel;

public class RatingViewModel extends ViewModel {
    public float numStart = 0.0F;
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getNumStart() {
        return numStart;
    }

    public void setNumStart(float numStart) {
        this.numStart = numStart;
    }
}
