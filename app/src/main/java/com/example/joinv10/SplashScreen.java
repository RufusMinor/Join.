package com.example.joinv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.joinv10.singin.SingInActivity;

public class SplashScreen extends AppCompatActivity {

private static int SPLASH_SKREEN=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(SplashScreen.this, SingInActivity.class);
                    startActivity(intent);
                }
            },SPLASH_SKREEN);
    }
}