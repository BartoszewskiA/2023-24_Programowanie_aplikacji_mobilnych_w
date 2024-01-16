package com.example.w10p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView01;
    String[] zawartoscListy = new String[] {
            "Pozycja 01", "Pozycja 02","Pozycja 03","Pozycja 04","Pozycja 05",
            "Pozycja 06", "Pozycja 07","Pozycja 08","Pozycja 09","Pozycja 10",
            "Pozycja 11", "Pozycja 12","Pozycja 13","Pozycja 14","Pozycja 15",
            "Pozycja 11", "Pozycja 12","Pozycja 13","Pozycja 14","Pozycja 15"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView01 = findViewById(R.id.listView01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.lista, zawartoscListy);
        listView01.setAdapter(adapter);
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Kliknięto na pozycję: "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}