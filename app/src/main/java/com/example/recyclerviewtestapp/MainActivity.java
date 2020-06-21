package com.example.recyclerviewtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtestapp.adapter.NumbersAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView numberList;
    private NumbersAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberList = findViewById(R.id.rv_numbers);

        LinearLayoutManager layerManager = new LinearLayoutManager(this);
        numberList.setLayoutManager(layerManager);
        numberList.setHasFixedSize(true);
        numbersAdapter = new NumbersAdapter(30);

        numberList.setAdapter(numbersAdapter);

    }
}
