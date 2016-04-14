package com.example.howard.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private EditText edit;
    private ProgressBar pb;
    private static  String TAG = "haoyang";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = (Button) findViewById(R.id.m_btn1);
        btn_1.setOnClickListener(bc);
        btn_2 = (Button) findViewById(R.id.m_btn2);
        btn_2.setOnClickListener(bc2);
        btn_3 = (Button) findViewById(R.id.m_btn3);
        btn_3.setOnClickListener(bc3);
        edit=(EditText)findViewById(R.id.m_edit);
        pb=(ProgressBar)findViewById(R.id.m_pb);
    }

    View.OnClickListener bc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent sec=new Intent(MainActivity.this,Sec_Activity.class);
//            String s=edit.getText().toString();
//            sec.putExtra("number",Integer.parseInt(s));
            startActivity(sec);
//            AlertDialog.Builder al = new AlertDialog.Builder(MainActivity.this);
//            al.setTitle("Dialog");
//            al.setMessage("Progressbar disable");
//            al.setCancelable(true);
//            al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    pb.setVisibility(View.GONE);
//                }
//            });
//            al.setNegativeButton("no", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//
//                }
//            });
//            al.show();

        }
    };

    View.OnClickListener bc2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Intent in = new Intent(Intent.ACTION_CALL);
//            in.setData(Uri.parse("tel:10086"));
//            try{
//                startActivity(in);
//                String s = getClass().getSimpleName();
//                Log.v(TAG, getClass().toString());
//            }catch (Exception e){
//                Log.v(TAG,e.toString());
//            }
//            ProgressDialog.Builder pd=new ProgressDialog.Builder(MainActivity.this);
//            pd.setTitle("ProgressDialog");
//            pd.setMessage("change");
//            pd.setCancelable(true);
//            pd.show();
        }
    };
    View.OnClickListener bc3=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Intent tmp=new Intent(MainActivity.this,TemActivity.class);
//            startActivity(tmp);

        }
    };


}
