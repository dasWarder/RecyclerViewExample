package com.example.recyclerviewtestapp.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtestapp.R;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView listItemNumberView;
    TextView viewHolderIndex;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);

        initParam(itemView);
    }

    void bind(int listIndex) {
        listItemNumberView.setText(String.valueOf(listIndex));
    }

    private void initParam(@NonNull View itemView) {
        listItemNumberView = itemView.findViewById(R.id.tv_number_item);
        viewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number);
    }
}
