package com.example.w07p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText tv_odpowiedz;
    Button bt_wyslij;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_odpowiedz = findViewById(R.id.a2_et_odpowiedz);
        bt_wyslij = findViewById(R.id.a2_bt_wyslij);
        sluchaczPrzycisku();

    }

    private void sluchaczPrzycisku() {
        bt_wyslij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                przygotujOdpowiedz();
                finish();
            }
        });
    }

    private void przygotujOdpowiedz() {
        String s = tv_odpowiedz.getText().toString();
        Intent intencja = new Intent();
        intencja.putExtra("odpowiedz", s);
        setResult(RESULT_OK, intencja);
    }
}