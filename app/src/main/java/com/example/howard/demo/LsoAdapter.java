package com.example.howard.demo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Howard on 16/4/13.
 */
public class LsoAdapter extends ArrayAdapter<Lso> {
    private int res_id;
    private static  String TAG = "haoyang";
    private int i=0;
    public LsoAdapter(Context c,int itemres_id,List<Lso> ob){
        super(c,itemres_id,ob);
        res_id=itemres_id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Lso lso=getItem(position);
        View view;
        Viewholder vh;
        if (convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(res_id, null);
            vh=new Viewholder();
            vh.iv=(ImageView) view.findViewById(R.id.lso_img);
            vh.tv=(TextView) view.findViewById(R.id.lso_name);
            view.setTag(vh);
            Log.v(TAG, "getviewItem" + (i++));
        }
        else {
            view=convertView;
            vh=(Viewholder) view.getTag();
        }
        vh.iv.setImageResource(lso.getImg());
        vh.tv.setText(lso.getName());
        return view;
    }
    class Viewholder{
        ImageView iv;
        TextView tv;
    }
}
