package com.brahimcah.probes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    String[] habitants = new String[]{
            "-", "mico1.jpg", "mico2.jpg","mico3.jpg","mico4.jpg","1212","459","4.208","218","1.084","769"
    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = (int)(Math.random()*10+1);


        final Button btn_1 = findViewById(R.id.btn1);
        final ImageView img1=findViewById(R.id.img1);
        final ImageView img2=findViewById(R.id.img2);
        String a = "R.drawable.(habitants[1])";
        img1.setImageResource(Integer.parseInt(a));
        img2.setImageResource(R.drawable.mico2);
        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}


