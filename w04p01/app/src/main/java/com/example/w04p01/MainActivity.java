package com.example.w04p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    SeekBar suwak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.textView01);
        suwak = findViewById(R.id.seekBar01);
        sluchaczZdarzen();
    }

    private void sluchaczZdarzen() {
        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                wynik.setText(String.valueOf(progress));
                /*Toast.makeText(MainActivity.this, String.valueOf(progress), Toast.LENGTH_SHORT).show();*/
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Rozpoczęto suwania", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Zakończono suwania", Toast.LENGTH_SHORT).show();
            }
        });
    }
}