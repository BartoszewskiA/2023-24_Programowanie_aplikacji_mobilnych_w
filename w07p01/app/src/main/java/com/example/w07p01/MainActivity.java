package com.example.w07p01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_wynik;
    Button bt_otworz;

    final static int KOD_ODP_OKNA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_wynik = findViewById(R.id.tV_wynik);
        bt_otworz = findViewById(R.id.bt_otworz);
        sluchaczPrzycisku();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == KOD_ODP_OKNA && resultCode == RESULT_OK)
        {
            String w = data.getExtras().getString("odpowiedz");
            tv_wynik.setText(w);
        }

    }

    private void sluchaczPrzycisku() {
        bt_otworz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja  = new Intent(getApplicationContext(), MainActivity2.class);

                startActivityForResult(intencja, KOD_ODP_OKNA);
            }
        });
    }
}