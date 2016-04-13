package com.example.howard.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sec_Activity extends AppCompatActivity {

    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_);
        t=(TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        int num = intent.getIntExtra("number",0);
        t.setText(String.valueOf(num));
    }
}
