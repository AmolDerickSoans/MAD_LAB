package com.amol.lab4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Toast toast = new Toast(getApplicationContext());
        ImageView view = new ImageView(getApplicationContext());
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled

                    image.setImageResource(R.drawable.icecream_circle);
                    view.setImageResource(R.drawable.mute);
                    toast.setView(view);
                    toast.show();


                } else {
                    // The toggle is disabled
                    image.setImageResource(R.drawable.donut_circle);
                    view.setImageResource(R.drawable.ringer);
                    toast.setView(view);
                    toast.show();



                }
            }
        });
        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                if(toggle.isChecked())
                {
                    //action sets mode to silent
                    ((AudioManager) getBaseContext().getSystemService(Context.AUDIO_SERVICE)).setRingerMode(AudioManager.RINGER_MODE_SILENT);
                    Toast.makeText(MainActivity.this, "Silent mode is now on", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //action sets mode to ringing
                    ((AudioManager) getBaseContext().getSystemService(Context.AUDIO_SERVICE)).setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                    Toast.makeText(MainActivity.this, "Silent mode is now off", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }

}