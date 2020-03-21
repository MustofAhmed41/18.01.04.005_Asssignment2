package com.example.a180104005_asssignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout lay;
    TextView virusText;
    Button virusButton;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay = (RelativeLayout) findViewById(R.id.layout);
        lay.setOnClickListener(this);
        n = 1;
        virusText = (TextView) findViewById(R.id.virusText);
        virusButton = (Button) findViewById(R.id.virusButton);

        virusText.setAlpha(0);
        virusButton.setAlpha(0);

    }


    @Override
    public void onClick(View v) {
        //btnstop.animate().alpha(1).translationY(-10).setDuration(300).start(); // button will appear from bottom
        if(n==1){
            virusButton.animate().alpha(1).translationY(-80).setDuration(700).start(); // button will appear from bottom
            n++;
        }else if(n==2){
            virusText.animate().alpha(1).translationY(-80).setDuration(700).start();
            n++;
        }else{
            Intent intent = new Intent(MainActivity.this,absolute_Layoutt.class);
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // this might throw an error becareful // animation of activity
            startActivity(intent);
            n=1;
        }
    }
}
