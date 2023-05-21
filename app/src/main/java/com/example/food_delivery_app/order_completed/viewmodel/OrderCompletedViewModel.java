package com.example.food_delivery_app.order_completed.viewmodel;


import androidx.lifecycle.ViewModel;

import com.example.food_delivery_app.order_completed.adapter.OrderCompletedAdapter;
import com.example.food_delivery_app.order_completed.model.OrderCompleted;

import java.util.ArrayList;

public class OrderCompletedViewModel extends ViewModel {
    // data to populate the RecyclerView with
    public ArrayList<OrderCompleted> orderCompleteds = new ArrayList<>();

    public void setList() {
        orderCompleteds.add(new OrderCompleted(1, "https://vnvinaphone.vn/wp-content/uploads/2021/11/Veggie-mania.jpg", "Pizza Nấm Ớ Ngọt Chay", "Medium", "2", "320.000"));
        orderCompleteds.add(new OrderCompleted(2, "https://i-giadinh.vnecdn.net/2022/04/20/Buoc-9-9-3230-1650439557.jpg", "Mỳ Ý Spaghetti", "Large", "1", "140.000"));
        orderCompleteds.add(new OrderCompleted(3, "https://food-images.files.bbci.co.uk/food/recipes/easy_caesar_salad_64317_16x9.jpg", "Caesar Salad Sauce", "Medium", "1", "120.000"));
        orderCompleteds.add(new OrderCompleted(4, "https://vnn-imgs-f.vgcloud.vn/2019/10/05/13/cach-lam-ca-hoi-sot-chanh-day-ngon-kho-cuong.jpg", "Cá Hồi Sốt Chanh Dây", "Medium", "1", "200.000"));
        orderCompleteds.add(new OrderCompleted(5, "https://i.ytimg.com/vi/4X2ksdsF400/maxresdefault.jpg", "Bò Hầm Rau Củ", "Medium", "1", "150.000"));
        orderCompleteds.add(new OrderCompleted(6, "https://congluan-cdn.congluan.vn/files/content/2022/05/17/hanh-trinh-chiec-banh-hamburger-%E2%80%98chinh-phuc%E2%80%99-nuoc-my-071525855.jpg", "Hamburger Beef", "Large", "1", "140.000"));
    }
}
