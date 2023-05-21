package com.example.food_delivery_app.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.food_delivery_app.order_completed.viewmodel.OrderCompletedViewModel;
import com.example.food_delivery_app.order_completed.viewmodel.RatingViewModel;

public class BaseFragment extends Fragment {
    public OrderCompletedViewModel orderCompletedViewModel;
    public RatingViewModel ratingViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orderCompletedViewModel =  ViewModelProviders.of(requireActivity()).get(OrderCompletedViewModel.class);
        ratingViewModel =  ViewModelProviders.of(requireActivity()).get(RatingViewModel.class);

    }
}
