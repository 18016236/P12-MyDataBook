package com.example.p12_mydatabook;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class arrayAdapters extends ArrayAdapter<String> {
    private ArrayList<String> array;
    private Context context;
    private TextView tvName;
    private ImageView iv;

    public arrayAdapters(@NonNull Context context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        array = objects;
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);

        tvName = (TextView) rowView.findViewById(R.id.tvName);
        iv = (ImageView)rowView.findViewById(R.id.iv);

        String current = array.get(position);

        tvName.setText(current);
        if (position == 0){
            iv.setImageResource(R.drawable.info);
        }else if (position == 1){
            iv.setImageResource(R.drawable.syringe);
        }else if (position == 2){
            iv.setImageResource(R.drawable.download);
        }else{
            iv.setImageResource(R.drawable.star);
        }
        return rowView;
    }
}
