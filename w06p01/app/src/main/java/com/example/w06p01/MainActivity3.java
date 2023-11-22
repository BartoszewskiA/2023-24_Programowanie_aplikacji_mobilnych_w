package com.example.w06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = findViewById(R.id.a3_tv_01);
        Bundle paczka = getIntent().getExtras();
        String s = paczka.getString("dana01");
        int l = paczka.getInt("dana02");
        t1.setText(s + " " + l);
    }
}