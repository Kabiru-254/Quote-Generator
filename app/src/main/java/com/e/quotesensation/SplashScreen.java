package com.e.quotesensation;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class SplashScreen extends AppCompatActivity {

    TextView TitleLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TitleLog = findViewById(R.id.tvTitleLog);
        TitleLog.setPaintFlags(TitleLog.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);



    }
}