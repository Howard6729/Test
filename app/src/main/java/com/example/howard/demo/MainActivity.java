package com.example.howard.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn;
    private Button btn_2;
    private static  String TAG = "haoyang";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(bc);
        btn_2 = (Button) findViewById(R.id.button2);
        btn_2.setOnClickListener(bcn);


    }

    View.OnClickListener bc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent sec=new Intent(MainActivity.this,Sec_Activity.class);
            sec.putExtra("number",3);
            startActivity(sec);
        }
    };

    View.OnClickListener bcn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(Intent.ACTION_CALL);
            in.setData(Uri.parse("tel:10086"));
            try{
//                startActivity(in);
                String s = getClass().getSimpleName();
                Log.v(TAG,getClass().toString());
            }catch (Exception e){
                Log.v(TAG,e.toString());
            }

        }
    };


}
