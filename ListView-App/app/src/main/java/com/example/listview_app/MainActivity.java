package com.example.listview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String []arr = {"item0", "item1", "item2", "item3", "item4", "item5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        // Using Builtin ArrayAdapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);

        //Using OnClick Listener in every item of ArrayAdapter
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "(Doing From MainActivity.java) You Clicked On "+i, Toast.LENGTH_SHORT).show();
//            }
//        });


        // Using Custom Array Adapter and also using OnClick Listener in every item
         KawshikAdapter ad = new KawshikAdapter(this, R.layout.kawshik_layout, arr);
         listView.setAdapter(ad);
    }
}