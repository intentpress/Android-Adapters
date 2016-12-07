package com.intentpress.listviewexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public ListViewAdapter listAdapter;
    public ListView listView;
    public String nameString[] = {"Samsung", "Nokia", "Apple", "Blackberry", "Sony"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        listAdapter = new ListViewAdapter(this);
        listView.setAdapter(listAdapter);
        listAdapter.nameString = nameString;
        listAdapter.notifyDataSetChanged();
    }
}