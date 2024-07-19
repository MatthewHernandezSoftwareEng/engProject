package com.zybooks.engproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activityTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_page);


        Button timer_start_button = findViewById(R.id.timer_start_button);
        EditText usertext = findViewById(R.id.workoutTime);
        EditText clock_display = findViewById(R.id.clock_display);
        timer_start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!timer_start_button.isActivated()) {
                    timer_start_button.setActivated(true);
                    timer temp = new timer();
                    temp.count = Integer.parseInt(usertext.getText().toString());
                    System.out.println(Integer.parseInt(usertext.getText().toString()));
                    temp.clock_display = clock_display;
                    temp.timer_start = timer_start_button;
                    temp.runTimer();

                }
            }
        });
    }
}