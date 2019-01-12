package com.example.akshay.customspinnerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context Context;
    String java[];
    int icon[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] java, int[] icon) {
        this.Context=applicationContext;
        this.java=java;
        this.icon=icon;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return java.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.custom_spinner_item,null);

        TextView textView=view.findViewById(R.id.textView);
        ImageView imageView=view.findViewById(R.id.imageView);

        imageView.setImageResource(icon[i]);
        textView.setText(java[i]);


        return view;
    }
}
