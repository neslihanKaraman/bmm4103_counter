package com.example.number_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashScreen.this,SecondActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}