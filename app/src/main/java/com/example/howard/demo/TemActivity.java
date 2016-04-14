package com.example.howard.demo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Howard on 16/4/13.
 */
public class TemActivity extends Activity implements View.OnClickListener{

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tep);
        btn=(Button)findViewById(R.id.lf_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lf_btn:
                Other_fra of = new Other_fra();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.tep_flayout,of);
                ft.commit();
                break;
            default:
                break;
        }
    }
}
