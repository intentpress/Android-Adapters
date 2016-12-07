package com.intentpress.adaptersforlistandgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public ListViewAdapter listAdapter;
    public GridViewAdapter gridAdapter;
    public ListView listView;
    public GridView gridView;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        gridView = (GridView)findViewById(R.id.grid_view);
        listAdapter = new ListViewAdapter(this);
        gridAdapter = new GridViewAdapter(this);
        listView.setAdapter(listAdapter);
        gridView.setAdapter(gridAdapter);
    }
}
