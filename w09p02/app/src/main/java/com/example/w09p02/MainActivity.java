package com.example.w09p02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv01;
    EditText et01;
    Button bt01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv01 = findViewById(R.id.textView01);
        et01 = findViewById(R.id.editText01);
        bt01 = findViewById(R.id.button01);

        SharedPreferences sp = this.getPreferences(Context.MODE_PRIVATE);
        String name = sp.getString("name","NN");
        tv01.setText(name);

        bt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv01.setText(et01.getText().toString());
                SharedPreferences sp = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor edytor = sp.edit();
                edytor.putString("name",et01.getText().toString());
                edytor.commit();

            }
        });
    }
}