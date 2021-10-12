package com.example.dailynews;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;

import android.view.WindowManager;


import android.widget.ImageView;

public class introductory_activity extends AppCompatActivity {
    ImageView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory_activity);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        appName=findViewById(R.id.logo);

        //Splash screen animation-
        //Code for OnBoarding and Splash screen time out function-

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(introductory_activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1100);
    }
}