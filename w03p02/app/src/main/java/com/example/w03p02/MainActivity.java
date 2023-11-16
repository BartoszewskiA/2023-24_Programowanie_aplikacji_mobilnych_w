package com.example.w03p02;

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


        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                if(id == R.id.button01)
                    opis.setText("Kliknięto przycisk 01");
                else if(id == R.id.button02)
                    opis.setText("Kliknięto przycisk 02");
            }
        };

        przycisk01.setOnClickListener(sluchacz);
        przycisk02.setOnClickListener(sluchacz);
    }
}