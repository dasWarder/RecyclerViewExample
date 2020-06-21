package com.example.recyclerviewtestapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtestapp.R;

public class NumbersAdapter extends RecyclerView.Adapter<NumberViewHolder> {

    private static int viewHolderCount;
    private NumberViewHolder viewHolder;
    private int numberItems;

    public NumbersAdapter(int numberItems) {
        this.numberItems = numberItems;
        viewHolderCount = 0;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutIdForListItem = R.layout.number_list_item;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        viewHolder = new NumberViewHolder(view);
        viewHolder.viewHolderIndex.setText("ViewHolder index: " + viewHolderCount);
        viewHolderCount++;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }
}
