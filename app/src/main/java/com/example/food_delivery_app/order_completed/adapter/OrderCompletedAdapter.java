package com.example.food_delivery_app.order_completed.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.food_delivery_app.R;
import com.example.food_delivery_app.base.dialog.CustomDialogClass;
import com.example.food_delivery_app.order_completed.model.OrderCompleted;

import java.util.List;

public class OrderCompletedAdapter extends RecyclerView.Adapter<OrderCompletedAdapter.NoteVH> {

    private List<OrderCompleted> mNoteList;
    private Activity activity;

    public OrderCompletedAdapter(List<OrderCompleted> noteList, Activity activity) {
        mNoteList = noteList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public NoteVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteVH(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_order_completed, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final NoteVH holder, int position) {
//      Bước 4.	Người dùng nhấn vào nút đánh giá để xác lập đánh giá
        holder.bindData(mNoteList.get(position));
        holder.btRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", holder.id);
                Navigation.findNavController(holder.itemView).navigate(R.id.action_listCompletedFragment_to_rateCommentFrgment, bundle);
            }
        });
//      Bước 8.	Người dùng nhấn vào nút xem đánh giá để xem lại nội dung đánh giá.
        holder.btViewDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialogClass cdd=new CustomDialogClass(activity, holder.id);
                cdd.show();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int displayWidth = displayMetrics.widthPixels;
                int displayHeight = displayMetrics.heightPixels;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(cdd.getWindow().getAttributes());
                int dialogWindowWidth = (int) (displayWidth * 0.9f);
//                int dialogWindowHeight = (int) (displayHeight * 0.9f);
                layoutParams.width = dialogWindowWidth;
//                layoutParams.height = dialogWindowHeight;
                cdd.getWindow().setAttributes(layoutParams);

            }
        });
    }

    public void addNewNote(OrderCompleted note) {
        if (!mNoteList.contains(note)) {
            mNoteList.add(note);
            notifyItemInserted(mNoteList.size());
        }
    }

//   Bước 3.	Người dùng xem thông tin đơn hàng và chọn đơn hàng cần đánh giá.

    @Override
    public int getItemCount() {
        return mNoteList != null ? mNoteList.size() : 0;
    }

    class NoteVH extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView image;
        private TextView quantity;
        private TextView price;
        private TextView size;
        private Button btRate;
        private Button btViewDetail;
        private int id;

        public NoteVH(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_order_name);
            image = itemView.findViewById(R.id.img_item);
            quantity = itemView.findViewById(R.id.tv_order_quantity);
            price = itemView.findViewById(R.id.tv_order_price);
            size = itemView.findViewById(R.id.tv_order_size);
            btRate = itemView.findViewById(R.id.bt_rate);
            btViewDetail = itemView.findViewById(R.id.bt_view_detail);
        }

        public void bindData(OrderCompleted item) {
            name.setText(item.getName());
            Glide.with(itemView.getContext()).load(item.getImage()).into(image);
            quantity.setText("x" + item.getQuantity());
            price.setText(item.getPrice());
            size.setText(item.getSize());
            id = item.getId();
        }
    }
}