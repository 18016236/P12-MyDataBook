package com.example.p12_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class DrawerArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public DrawerArrayAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        return rowView;
    }
}
