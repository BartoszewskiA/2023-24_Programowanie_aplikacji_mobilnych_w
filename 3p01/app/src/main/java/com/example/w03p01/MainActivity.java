package com.example.w03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView opis;
    Button przycisk01, przycisk02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.textView01);
        przycisk01 = findViewById(R.id.button01);
        przycisk02 = findViewById(R.id.button02);

        przycisk01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opis.setText("Kliknieto przycisk 01");
            }
        });


        przycisk02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opis.setText("Kliknieto przycisk 02");
            }
        });

        opis.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                opis.setText("---");
                return false;
            }
        });
    }

}