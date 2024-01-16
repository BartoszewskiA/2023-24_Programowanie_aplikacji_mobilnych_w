package com.example.w09p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        textView01.setText(textView01.getText().toString()+"\nOnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView01.setText(textView01.getText().toString()+"\nOnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView01.setText(textView01.getText().toString()+"\nOnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView01.setText(textView01.getText().toString()+"\nOnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView01.setText(textView01.getText().toString()+"\nOnRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView01.setText(textView01.getText().toString()+"\nOnStop");
    }
}