package com.troyling.project1_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by troyling on 3/20/15.
 */
public class ListAdapter extends ArrayAdapter {
    private static final int NUM_ITEM = 10;
    private Context context;

    public ListAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    public int getCount() {
        return NUM_ITEM;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.rowlayout, null, false);
        return v;
    }

}
