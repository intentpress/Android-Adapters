package com.intentpress.listviewexample3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ListViewAdapter  extends BaseAdapter {
    public Context context;
    public TextView name;
    public String nameString[] = {"Steve", "Arnold", "Rock", "Jimmy", "John"};

    public ListViewAdapter(Context cxt){
        this.context = cxt;
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.activity_list_view, null);
        name = (TextView) v.findViewById(R.id.name);
        name.setText(nameString[position]);
        return v;
    }
}