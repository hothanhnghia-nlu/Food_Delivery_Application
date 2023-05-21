package com.example.food_delivery_app.order_completed;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.food_delivery_app.R;
import com.example.food_delivery_app.base.BaseFragment;
import com.example.food_delivery_app.order_completed.adapter.OrderCompletedAdapter;

public class ListCompletedFragment extends BaseFragment {
    private RecyclerView revOrderCompleted;
    private OrderCompletedAdapter orderCompletedAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_completed, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initRev();
    }

    private void initView() {

    }

    private void initRev(){
        orderCompletedViewModel.setList();
        // set up the RecyclerView
        revOrderCompleted = getView().findViewById(R.id.listOrders);
        revOrderCompleted.setLayoutManager(new LinearLayoutManager(requireContext()));
        orderCompletedAdapter = new OrderCompletedAdapter(orderCompletedViewModel.orderCompleteds, requireActivity());
//        adapter.setClickListener(this);
        revOrderCompleted.setAdapter(orderCompletedAdapter);
    }
}