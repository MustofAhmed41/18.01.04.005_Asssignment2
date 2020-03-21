package com.example.a180104005_asssignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FrameLayout extends AppCompatActivity implements View.OnClickListener {
    int n = 1;
    ImageView first;
    ImageView one;
    ImageView two;
    ImageView three;
    ImageView four;
    ImageView five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        first = (ImageView) findViewById(R.id.first);
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        first.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.first){
            first.setVisibility(View.GONE);
            one.setVisibility(View.VISIBLE);

        }else if(v.getId() == R.id.one){
            one.setVisibility(View.GONE);
            two.setVisibility(View.VISIBLE);
        }else if(v.getId() == R.id.two){
            two.setVisibility(View.GONE);
            three.setVisibility(View.VISIBLE);
        }else if(v.getId() == R.id.three){
            three.setVisibility(View.GONE);
            four.setVisibility(View.VISIBLE);
        }else if(v.getId() == R.id.four){
            four.setVisibility(View.GONE);
            five.setVisibility(View.VISIBLE);
        }else if(v.getId() == R.id.five){
            Intent intent = new Intent(FrameLayout.this,TableLayoutt.class);
            startActivity(intent);
        }
    }
}
