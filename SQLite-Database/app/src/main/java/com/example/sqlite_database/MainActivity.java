package com.example.sqlite_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHandler handler = new DbHandler(this, "empdb", null, 1);
        handler.addEmployee(new Employee(1, "Kawshik", 33.3)); //while adding into database
        handler.getEmployee(1); //while getting from database
        handler.close();
    }
}