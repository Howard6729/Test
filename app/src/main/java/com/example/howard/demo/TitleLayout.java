package com.example.howard.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by Howard on 16/4/13.
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context c,AttributeSet arr){
        super(c,arr);
        LayoutInflater.from(c).inflate(R.layout.title,this);
    }
}
