package com.example.food_delivery_app.base.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.food_delivery_app.Database.SQLiteHandler;
import com.example.food_delivery_app.R;
import com.example.food_delivery_app.order_completed.model.Rate;
import com.example.food_delivery_app.order_completed.viewmodel.RatingViewModel;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button close;
    private int id;
    private TextView tvStar, tvContent, tvErr;
    private LinearLayout layoutData;

    public CustomDialogClass(Activity a, int id) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        this.id = id;
    }
//  Bước 9. Hệ thống hiển thị hộp thoại bao gồm số sao và nội dung đã đánh giá của đơn hang đó.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);

        close = findViewById(R.id.bt_close);
        close.setOnClickListener(this);
        tvStar = findViewById(R.id.tv_star);
        tvContent = findViewById(R.id.tv_content);
        tvErr = findViewById(R.id.tv_err);
        layoutData = findViewById(R.id.layout_data);

        try {
            System.out.println("Id bundle :::: " + id);
            SQLiteHandler sqLiteHandler = new SQLiteHandler(this.getContext());
            Rate rate = sqLiteHandler.getRatingWhereId(id);

            tvStar.setText("Số sao: " + rate.getRateNum());
            tvContent.setText(rate.getContent());
        }catch (Exception e){
            System.out.println("Err: " + e);
            layoutData.setVisibility(View.GONE);
            tvErr.setVisibility(View.VISIBLE);
        }
    }
//  Bước 10.	Nhấn vào nút đóng để thoát hộp thoại.
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_close:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}