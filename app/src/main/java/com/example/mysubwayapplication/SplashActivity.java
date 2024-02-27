package com.example.mysubwayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int splash_screen_timeout = 3000;

        //SplashScreen_imageView = (ImageView)findViewById(R.id.splash_icon_imageview);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(mySuperIntent);
                Log.i("Information","The Splash Screen is working in this application");
                finish();
            }
        }, splash_screen_timeout );

    }
}