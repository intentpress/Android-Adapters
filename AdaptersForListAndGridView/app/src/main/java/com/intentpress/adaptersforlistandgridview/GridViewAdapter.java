package com.intentpress.adaptersforlistandgridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class GridViewAdapter  extends BaseAdapter {
    public Context context;
    public String nameString[] = {"Ben", "Lisa", "Anna", "Julie", "katty"};
    public String ageString[] = {"18", "15", "27", "19", "23"};

    public GridViewAdapter(Context cxt){
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
        final ViewHolder viewHolder;
        convertView = ((Activity) context).getLayoutInflater().inflate(
                R.layout.activity_grid_view, null);
        viewHolder = new ViewHolder();
        viewHolder.name = (TextView) convertView
                .findViewById(R.id.name);
        viewHolder.age = (TextView) convertView
                .findViewById(R.id.age);
        viewHolder.name.setText(nameString[position]);
        viewHolder.age.setText(ageString[position]);
        convertView.setTag(viewHolder);
        return convertView;
    }
    static class ViewHolder {
        public TextView name, age;
    }
}
