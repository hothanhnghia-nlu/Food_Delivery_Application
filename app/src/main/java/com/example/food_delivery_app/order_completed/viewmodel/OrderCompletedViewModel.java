package com.example.food_delivery_app.order_completed.viewmodel;


import androidx.lifecycle.ViewModel;

import com.example.food_delivery_app.order_completed.adapter.OrderCompletedAdapter;
import com.example.food_delivery_app.order_completed.model.OrderCompleted;

import java.util.ArrayList;

public class OrderCompletedViewModel extends ViewModel {
    // data to populate the RecyclerView with
    public ArrayList<OrderCompleted> orderCompleteds = new ArrayList<>();

    public void setList() {
        orderCompleteds.add(new OrderCompleted(1, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 1", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(2, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 2", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(3, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 3", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(4, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 4", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(5, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 5", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(6, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 6", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(7, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 7", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(8, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 8", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(9, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 9", "medium", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(10, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza hai san 10", "medium", "1", "140.000"));
    }
}
