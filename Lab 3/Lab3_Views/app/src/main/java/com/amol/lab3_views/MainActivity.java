package com.amol.lab3_views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void grid(View view) {
        startActivity(new Intent(MainActivity.this , GridActivity.class));
    }

    public void tab(View view) {
        startActivity(new Intent(MainActivity.this, TabActivity.class));
    }

    public void table(View view) {
        startActivity(new Intent(MainActivity.this, TableActivity.class));
    }

    public void list(View view) {
        startActivity(new Intent(MainActivity.this, ListActivity.class));
    }
}