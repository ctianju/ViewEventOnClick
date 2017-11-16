package com.example.administrator.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2017/11/14.
 */

public class MyRelaticeLayout extends RelativeLayout {
    public MyRelaticeLayout(Context context) {
        super(context);
    }

    public MyRelaticeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelaticeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MyRelaticeLayout dispatchTouchEvent: ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MyRelaticeLayout dispatchTouchEvent: ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MyRelaticeLayout dispatchTouchEvent: ACTION_UP" );
                break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MyRelaticeLayout onTouchEvent: ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MyRelaticeLayout onTouchEvent: ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MyRelaticeLayout onTouchEvent: ACTION_UP" );
                break;

        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MyRelaticeLayout onInterceptTouchEvent: ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MyRelaticeLayout onInterceptTouchEvent: ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MyRelaticeLayout onInterceptTouchEvent: ACTION_UP" );
                break;

        }
        return super.onInterceptTouchEvent(ev);
    }
}
