package com.example.w11p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = findViewById(R.id.scrolView);
        getLayoutInflater().inflate(R.layout.skrol, sv);

    }
}