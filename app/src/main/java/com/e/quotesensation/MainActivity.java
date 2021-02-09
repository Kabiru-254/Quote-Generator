package com.e.quotesensation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = findViewById(R.id.tvTitle);
        Title.setPaintFlags(Title.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}