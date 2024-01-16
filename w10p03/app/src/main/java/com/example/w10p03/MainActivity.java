package com.example.w10p03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_01 = findViewById(R.id.tv01);
        registerForContextMenu(tv_01);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.poz_01)
            Toast.makeText(this, "Kliknięto pozycje 1", Toast.LENGTH_SHORT).show();
        else if (id == R.id.poz_02)
            Toast.makeText(this, "Kliknieto pozycje 2", Toast.LENGTH_SHORT).show();
        else if (id == R.id.poz_03)
            Toast.makeText(this, "Kliknięto pozycję 3", Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}