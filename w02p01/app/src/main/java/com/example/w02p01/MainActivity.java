package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText okienko1, okienko2;
   TextView poleWynik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okienko1 = findViewById(R.id.editText01);
        okienko2 = findViewById(R.id.editText02);
        poleWynik = findViewById(R.id.textView01);

    }

    public void licz(View view) {
        String s1 = okienko1.getText().toString();
        int x1,x2;
        if (s1.length()!=0)
             x1 = Integer.parseInt(s1);
        else
        {
            x1=0;
            okienko1.setText("0");
        }
        String s2 = okienko2.getText().toString();
        if (s2.length()!=0)
            x2 = Integer.parseInt(s2);
        else
        {
            x2=0;
            okienko2.setText("0");
        }
        poleWynik.setText(String.valueOf(x1+x2));
    }
}