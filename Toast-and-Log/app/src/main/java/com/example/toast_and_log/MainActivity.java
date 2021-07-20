package com.example.toast_and_log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("general", "App started properly. This is not shown in app.");

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButton1(view);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButton2(view);
            }
        });
    }
    public void setButton1(View view){
        Log.d("buttoncheck", "Button1 is debugging properly. This will not showed in app.");
        Log.e("buttoncheck", "Button1 is erroring properly. This will not showed in app.");
    }

    public void setButton2(View view){
        Toast.makeText(MainActivity.this, "This is a toast. Showed in App", Toast.LENGTH_SHORT).show();
        Log.d("buttoncheck", "Button2 is debugging properly. This will not showed in app.");
    }
}