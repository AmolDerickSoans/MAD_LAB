package com.amol.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    String[] mListArray = {"Egg" , "Milk" , "Cheese" , "Candy" , "Flour" , "Pasta Sauce"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.myList);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mListArray);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Added " + mListArray[position], Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Intent intent = new Intent("com.sec.print.mobileprint.action.PRINT");
    //Uri uri = Uri.parse("http://www.samsung.com");
    //intent.putExtra("com.sec.print.mobileprint.extra.CONTENT", uri );
    //intent.putExtra("com.sec.print.mobileprint.extra.CONTENT_TYPE", "WEBPAGE");
    //intent.putExtra("com.sec.print.mobileprint.extra.OPTION_TYPE", "DOCUMENT_PRINT");
    //intent.putExtra("com.sec.print.mobileprint.extra.JOB_NAME", "Untitled");
    //startActivity(intent);

}