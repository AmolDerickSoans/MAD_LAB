package com.amol.lab4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkbox ;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4 ;
    CheckBox checkbox5;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox =  findViewById(R.id.checkBox);
         checkbox2 = findViewById(R.id.checkBox2);
         checkbox3 = findViewById(R.id.checkBox3);
         checkbox4 = findViewById(R.id.checkBox4);
         checkbox5 = findViewById(R.id.checkBox5);
         mTextView = findViewById(R.id.textView6 );


    }

    public void placeOrder(View view) {

        double totalAmount =0;
        StringBuilder result = new StringBuilder();
        result.append("Selceted Items:");
        if(checkbox.isChecked()){
            result.append("\nChicken $7.00");
            totalAmount+= 7.00;
        }
        if(checkbox2.isChecked()){
            result.append("\nPasta Sauce $6.55");
            totalAmount+= 6.55;
        }
        if(checkbox3.isChecked()){
            result.append("\nBread $8.00");
            totalAmount+=8.00;
        }
        if(checkbox4.isChecked()){
            result.append("\nTomatoes $3.99");
            totalAmount+=3.99;
        }
        if(checkbox5.isChecked()){
            result.append("\nLamb $11.00");
            totalAmount+=11.00;
        }
        result.append("\nTotal: "+totalAmount+"$");
        mTextView.setText(result.toString());
        Toast.makeText(getApplicationContext(), "The grand total is"+ totalAmount+ "$" , Toast.LENGTH_LONG).show();

        checkbox.setEnabled(false);
        checkbox2.setEnabled(false);
        checkbox3.setEnabled(false);
        checkbox4.setEnabled(false);
        checkbox5.setEnabled(false);


    }
}