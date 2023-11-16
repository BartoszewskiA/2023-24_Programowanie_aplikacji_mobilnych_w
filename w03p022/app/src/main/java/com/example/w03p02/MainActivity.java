package com.example.w03p02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wynik, wynik2, wynik3;
    RatingBar gwiazdki;
    CheckBox poleWyboru;
    RadioGroup grupa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.textView01);
        wynik2 = findViewById(R.id.textView02);
        wynik3 = findViewById(R.id.textView03);
        gwiazdki = findViewById(R.id.ratingBar01);
        poleWyboru = findViewById(R.id.checkBox01);
        grupa = findViewById(R.id.radioGroup01);
        sluchaczZdarzen();
    }

    private void sluchaczZdarzen() {
        gwiazdki.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               /* if(rating<3) gwiazdki.setRating(3);*/
                wynik.setText(String.valueOf(rating));
            }
        });
        //---------------------------

        CompoundButton.OnCheckedChangeListener sluchaczPolaWyboru = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                    wynik2.setText("wybrano");
                else
                    wynik2.setText("nie wybrano");
            }
        };
        poleWyboru.setOnCheckedChangeListener(sluchaczPolaWyboru);
    //-----------------------------------------------------------------------
        grupa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb01)
                    wynik3.setText("kliknieto 01");
                else if(checkedId==R.id.rb02)
                    wynik3.setText("kliknieto 02");
                else if(checkedId==R.id.rb03)
                    wynik3.setText("kliknieto 03");
            }
        });
    }
}