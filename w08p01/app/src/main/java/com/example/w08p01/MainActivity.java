package com.example.w08p01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektorGestow;
    TextView textView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        detektorGestow = new GestureDetector(this, this);
        Log.e("AAAAAAAAAAA", "onCreate: ");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektorGestow.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        //textView01.setText("onDown: \n"+ e.getX()+ "\n"+e.getY());
        Log.d("GEST", "onDown: ");
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {
        //textView01.setText("onShowPress: \n"+ e.getX()+ "\n"+e.getY());
    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        // textView01.setText("onSingleTapUp: \n"+ e.getX()+ "\n"+e.getY());
        return false;
    }

    @Override
    public boolean onScroll(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
        //textView01.setText("oScroll: \n"+ distanceX+ "\n"+distanceY);
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {
        textView01.setText("onLongPress: \n"+ e.getX()+ "\n"+e.getY());
    }

    @Override
    public boolean onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
        //textView01.setText("onDown: \n"+ velocityX+ "\n"+velocityY);
        String s1= "Xp= " + Math.round(e1.getX()) + "  Xk= "+Math.round(e2.getX());
        String s2= "Yp= " + Math.round(e1.getY()) + "  Yk= "+Math.round(e2.getY());
        textView01.setText(s1+"\n"+s2);
        return false;
    }
}