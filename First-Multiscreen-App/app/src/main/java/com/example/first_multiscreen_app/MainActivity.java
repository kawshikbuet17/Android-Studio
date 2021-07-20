package com.example.first_multiscreen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    public static final String EXTRA_NAME = "com.example.first_multiscreen_app.extra.NAME"; //packagename.extra.NAME for mapping, just a name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view){
        Toast.makeText(this, "Button is pressed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);

        name = findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText); //for mapping purpose

        startActivity(intent);
    }
}