package com.drumond.beautufulswitchbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

        DayNightSwitch dayNightSwitch;
        View backgroundView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayNightSwitch = (DayNightSwitch) findViewById(R.id.dns_dayNight);
        backgroundView = (View) findViewById(R.id.v_background);

        dayNightSwitch.setDuration(450);
        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean is_night) {
                if (is_night) {
                    Toast.makeText(MainActivity.this, "Night Mode Selected", Toast.LENGTH_SHORT).show();
                    backgroundView.setAlpha(1F);
                } else {
                    Toast.makeText(MainActivity.this, "Day Mode Selected", Toast.LENGTH_SHORT).show();
                    backgroundView.setAlpha(0F);
                }
            }
        });
    }
}