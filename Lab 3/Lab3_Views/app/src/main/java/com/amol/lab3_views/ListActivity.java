package com.amol.lab3_views;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.amol.lab3_views.R;

public class ListActivity extends AppCompatActivity {
    private ListView mListView;
    String[] mListArray = {"Falcon9" , "Falcon Heavy" , "Proton" , "N1" , "ULA Delta IV" , "PSLV"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.myList);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mListArray);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(ListActivity.this, "You Added " + mListArray[position], Toast.LENGTH_SHORT).show());
    }


}

//  String[] mListArray = {"Falcon9" , "Falcon Heavy" , "Proton" , "N1" , "ULA Delta IV" , "PSLV"};