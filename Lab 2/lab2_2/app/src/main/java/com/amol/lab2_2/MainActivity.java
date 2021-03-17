package com.amol.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView res;
    Button plus;
    Button minus;
    Button mul;
    Button div;
    EditText val1;
    EditText val2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.result);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.multi);
        div = findViewById(R.id.div);

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                res.setText(String .valueOf(getVal(1)));
            }
        });

        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                res.setText(String.valueOf(getVal(2)));
            }
        });

        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                res.setText(String.valueOf(getVal(3)));
            }
        });

        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                res.setText(String.valueOf(getVal(4)));
            }
        });
    }

    private double getVal(int opt)
    {
        if(val1.getText().toString().isEmpty())
        {
            val1.setError("Enter value");
            return 0;
        }
        if(val2.getText().toString().isEmpty())
        {
            val2.setError("Enter value");
            return 0;
        }

        try
        {
            Double sval1 = Double.parseDouble(val1.getText().toString());
            Double sval2 = Double.parseDouble(val2.getText().toString());

            if(opt==1)
                return sval1+sval2;
            else if(opt==2)
                return sval1-sval2;
            else if(opt==3)
                return sval1*sval2;
            else
                return sval1/sval2;
        }
        catch(Exception e)
        {
            Toast.makeText(this, Log.getStackTraceString(e), Toast.LENGTH_SHORT).show();
        }
        return 0;
    }
}