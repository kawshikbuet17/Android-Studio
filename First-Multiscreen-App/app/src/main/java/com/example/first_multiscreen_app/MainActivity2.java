package com.example.first_multiscreen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView); //create new textview
        textView.setText("kawshikbuet17"); //test
        Intent intent = getIntent(); //get the intent which was created by sender
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME); //get the EXTRA_NAME string
        textView.setText("Your name is " + name); //set the gotten string to this textview
    }
}