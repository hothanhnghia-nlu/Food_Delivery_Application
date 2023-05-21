package com.example.food_delivery_app.order_completed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.food_delivery_app.R;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_in_left, R.anim.anim_out_right);
    }
}