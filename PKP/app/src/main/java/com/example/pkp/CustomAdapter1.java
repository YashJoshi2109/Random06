package com.example.pkp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter1 extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    LayoutInflater inflter;
    public CustomAdapter1(Context applicationContext, String[] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
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
        view = inflter.inflate(R.layout.activity_adlistview, null);
        TextView country = (TextView) view.findViewById(R.id.textv1);
        ImageView icon = (ImageView) view.findViewById(R.id.ad);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
