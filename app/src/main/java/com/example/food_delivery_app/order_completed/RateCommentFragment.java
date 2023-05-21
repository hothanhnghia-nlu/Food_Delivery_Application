package com.example.food_delivery_app.order_completed;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import com.example.food_delivery_app.Database.SQLiteHandler;
import com.example.food_delivery_app.R;
import com.example.food_delivery_app.base.BaseFragment;
import com.example.food_delivery_app.order_completed.model.Rate;

public class RateCommentFragment extends BaseFragment {

    private EditText edtComment;
    private RatingBar rb;
    private Button btSend;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rate_comment_frgment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtComment = getView().findViewById(R.id.edt_comment);
        rb = getView().findViewById(R.id.rb);
        btSend = getView().findViewById(R.id.bt_send);



        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingViewModel.numStart = rb.getRating();
                SQLiteHandler sqLiteHandler = new SQLiteHandler(view.getContext());
                assert getArguments() != null;
                ratingViewModel.setOrderId(getArguments().getInt("id"));
                Rate r = new Rate(1, ratingViewModel.getOrderId(), ratingViewModel.numStart, edtComment.getText().toString());
                sqLiteHandler.addRating(r);
                System.out.println("Rating " + sqLiteHandler.getRatingWhereId(r.getOrderId()).getContent());
                Navigation.findNavController(requireView()).popBackStack();
            }
        });
    }
}