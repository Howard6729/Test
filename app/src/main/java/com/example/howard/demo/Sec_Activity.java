package com.example.howard.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Sec_Activity extends Activity {

    private TextView t;
    private ListView lv;
    private String[] data={"data1","data2","data3","data4","data5","data6","data7",
            "data8","data9","data10","data11","data12","data13","data14"};
    private List<Lso> ll= new ArrayList<Lso>();
    private static  String TAG = "haoyang";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_);
//        t=(TextView)findViewById(R.id.sec_txt);
//        Intent intent = getIntent();
//        int num = intent.getIntExtra("number",0);
//        t.setText(String.valueOf(num));
        lv=(ListView)findViewById(R.id.sec_lv);
//        ArrayAdapter<String> ad=new ArrayAdapter<String>(Sec_Activity.this,android.R.layout.simple_list_item_1,data);
//        lv.setAdapter(ad);
        initll();
        LsoAdapter ad =new LsoAdapter(Sec_Activity.this,R.layout.lso_item,ll);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lso lso = ll.get(position);
                Toast.makeText(Sec_Activity.this, lso.getName(), Toast.LENGTH_SHORT).show();
                Log.v(TAG,"toast");
            }
        });

    }
    public void initll(){
        Lso a = new Lso("data1",R.drawable.ic_launcher);
        ll.add(a);
        Lso b = new Lso("data2",R.drawable.ic_launcher);
        ll.add(b);
        Lso c = new Lso("data3",R.drawable.ic_launcher);
        ll.add(c);
    }
}
