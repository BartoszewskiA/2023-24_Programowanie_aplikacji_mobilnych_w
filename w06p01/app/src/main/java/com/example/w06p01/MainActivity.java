package com.example.w06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button p01, p02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p01 = findViewById(R.id.button01);
        p02 = findViewById(R.id.button02);
        dodajSluchacza01();
        dodajSluchacza2();
    }

    private void dodajSluchacza2() {
        p02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MainActivity3.class);
                intencja.putExtra("dana01", "Tekst przekazy z aktywności nadrzędnej");
                intencja.putExtra("dana02", 101);
                startActivity(intencja);
            }
        });
    }

    private void dodajSluchacza01() {
        p01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MainActivity2.class );
                startActivity(intencja);
            }
        });
    }
}