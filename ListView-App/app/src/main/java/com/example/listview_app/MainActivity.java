package com.example.listview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"this is", "item1", "item2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(ad);
    }
}