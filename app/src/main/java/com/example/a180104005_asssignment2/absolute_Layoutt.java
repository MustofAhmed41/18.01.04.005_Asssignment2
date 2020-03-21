package com.example.a180104005_asssignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class absolute_Layoutt extends AppCompatActivity implements View.OnClickListener {
    int n =1;
    TextView string1;
    TextView string2;
    TextView string3;
    TextView string4;
    TextView string5;
    TextView string6;
    TextView button1;
    TextView button2;
    TextView button3;
    TextView button4;
    TextView button5;
    TextView button6;
    Button button;
    AbsoluteLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute__layoutt);
        string1 = (TextView) findViewById(R.id.string1);
        string2 = (TextView) findViewById(R.id.string2);
        string3 = (TextView) findViewById(R.id.string3);
        string4 = (TextView) findViewById(R.id.string4);
        string5 = (TextView) findViewById(R.id.string5);
        string6 = (TextView) findViewById(R.id.string6);
        button1 = (TextView) findViewById(R.id.button1);
        button2 = (TextView) findViewById(R.id.button2);
        button3 = (TextView) findViewById(R.id.button3);
        button4 = (TextView) findViewById(R.id.button4);
        button5 = (TextView) findViewById(R.id.button5);
        button6 = (TextView) findViewById(R.id.button6);
        button = (Button) findViewById(R.id.button);
        string1.setAlpha(0);
        string2.setAlpha(0);
        string3.setAlpha(0);
        string4.setAlpha(0);
        string5.setAlpha(0);
        string6.setAlpha(0);
        button1.setAlpha(0);
        button2.setAlpha(0);
        button3.setAlpha(0);
        button4.setAlpha(0);
        button5.setAlpha(0);
        button6.setAlpha(0);
        button.setAlpha(0);
        lay = (AbsoluteLayout) findViewById(R.id.layout);
        lay.setOnClickListener(this);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button){
            Intent intent = new Intent(absolute_Layoutt.this,FrameLayout.class);

            startActivity(intent);
        }

        if(v.getId()==R.id.layout) {

            if (n == 1) {
                string1.animate().alpha(1).translationX(-80).setDuration(700).start();
                button1.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 2) {
                string2.animate().alpha(1).translationX(-80).setDuration(700).start();
                button2.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 3) {
                string3.animate().alpha(1).translationX(-80).setDuration(700).start();
                button3.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 4) {
                string4.animate().alpha(1).translationX(-80).setDuration(700).start();
                button4.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 5) {
                string5.animate().alpha(1).translationX(-80).setDuration(700).start();
                button5.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 6) {
                string6.animate().alpha(1).translationX(-80).setDuration(700).start();
                button6.animate().alpha(1).translationX(-80).setDuration(700).start();
                n++;
            } else if (n == 7) {
                button.animate().alpha(1).translationY(-80).setDuration(700).start();
                n++;
            } else {


            }

        }
    }

}
