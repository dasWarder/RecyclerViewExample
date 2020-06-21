package com.example.recyclerviewtestapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtestapp.R;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView listItemNumberView;
    private TextView viewHolderIndex;
    private Context context;


    public NumberViewHolder(@NonNull View itemView, final Context context) {
        super(itemView);
        this.context = context;

        initParam(itemView);

        clickListener(itemView, context);
    }

    void bind(int listIndex) {
        listItemNumberView.setText(String.valueOf(listIndex));
    }

    private void initParam(@NonNull View itemView) {
        listItemNumberView = itemView.findViewById(R.id.tv_number_item);
        viewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number);
    }

    private void clickListener(@NonNull View itemView, final Context context) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context parent = context;
                int possitionIndex = getAdapterPosition();

                Toast toast = Toast.makeText(parent, "Element " + possitionIndex + " was clicked", Toast.LENGTH_SHORT);
                colorSet(toast);
                toast.show();
            }
        });
    }

    private void colorSet(Toast toast) {
        View toastView = toast.getView();
        PorterDuffColorFilter greyFilter = new PorterDuffColorFilter(Color.rgb(254, 220, 148), PorterDuff.Mode.MULTIPLY);
        toastView.getBackground().setColorFilter(greyFilter);
    }

    public TextView getListItemNumberView() {
        return listItemNumberView;
    }

    public TextView getViewHolderIndex() {
        return viewHolderIndex;
    }

    public Context getContext() {
        return context;
    }
}
