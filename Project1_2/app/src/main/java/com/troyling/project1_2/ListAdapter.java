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
    private static final int NUM_ITEM = 20;
    private Context context;

    public ListAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    public int getCount() {
        return NUM_ITEM;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = position%2 == 0 ? inflater.inflate(R.layout.rowlayout1, null, true) : inflater.inflate(R.layout.rowlayout2, null, true);
        return v;
    }

}
