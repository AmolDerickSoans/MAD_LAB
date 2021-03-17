package com.amol.lab4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast toast = new Toast(getApplicationContext());
                    ImageView view = new ImageView(getApplicationContext());
                        view.setImageResource(R.drawable.ic_action_name);
                        toast.setView(view);
                        toast.show();
                } else {
                    // The toggle is disabled
                }
            }
        });

    }


    public void showimage(View view) {
        Toast toast = new Toast(getApplicationContext());
        ImageView view1 = new ImageView(getApplicationContext());
        view1.setImageResource(R.drawable.ic_action_name_1);
        toast.setView(view1);
        toast.show();
    }
}