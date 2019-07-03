package com.yunfeng.scrollviewnestedrecyclerviewdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<SimpleRcvViewHolder> {

    @NonNull
    @Override
    public SimpleRcvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SimpleRcvViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleRcvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
