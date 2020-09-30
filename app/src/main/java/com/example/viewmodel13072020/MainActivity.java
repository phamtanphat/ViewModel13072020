package com.example.viewmodel13072020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtn;
    TextView mTv;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

//        re-create
        mBtn = findViewById(R.id.buttonChangeText);
        mTv = findViewById(R.id.textview);

        myViewModel.getMutableString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTv.setText(s);
            }
        });

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.setString("Xin chao");
            }
        });

    }
}