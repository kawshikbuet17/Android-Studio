package com.example.listview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String []arr = {"item0", "item1", "item2", "item3", "item4", "item5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        //Using Builtin Array Adapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);

        // Using Custom Array Adapter
        KawshikAdapter ad = new KawshikAdapter(this, R.layout.kawshik_layout, arr);
        listView.setAdapter(ad);
    }
}