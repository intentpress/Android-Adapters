package com.intentpress.listviewexample3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                listAdapter.nameString = nameString;
                listAdapter.notifyDataSetChanged();
            }
        });

    }
}