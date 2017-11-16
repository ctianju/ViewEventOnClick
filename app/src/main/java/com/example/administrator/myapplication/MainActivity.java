package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", " text: onClick------------" );
            }
        });
        findViewById(R.id.text).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                Log.e("TAG", " text: onClick------------" );
                if (view.getId()==R.id.text)
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e("TAG", "text OnTouchListener: ACTION_DOWN------------" );
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e("TAG", "text OnTouchListener: ACTION_MOVE-----------" );
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e("TAG", "text OnTouchListener: ACTION_UP-----------" );
                        break;

                }
                return true;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MainActivity dispatchTouchEvent: ACTION_DOWN------------" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MainActivity dispatchTouchEvent: ACTION_MOVE-----------" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MainActivity dispatchTouchEvent: ACTION_UP-----------" );
                break;

        }
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MainActivity onTouchEvent: ACTION_DOWN---------" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MainActivity onTouchEvent: ACTION_MOVE-----------" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MainActivity onTouchEvent: ACTION_UP------------" );
                break;

        }
        return super.onTouchEvent(event);
    }
}
