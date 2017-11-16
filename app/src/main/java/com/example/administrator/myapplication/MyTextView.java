package com.example.administrator.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/11/14.
 */

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MyTextView dispatchTouchEvent: ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MyTextView dispatchTouchEvent: ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MyTextView dispatchTouchEvent: ACTION_UP" );
                break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG", "MyTextView onTouchEvent: ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG", "MyTextView onTouchEvent: ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG", "MyTextView onTouchEvent: ACTION_UP" );
                break;

        }
        return super.onTouchEvent(event);
    }
}
