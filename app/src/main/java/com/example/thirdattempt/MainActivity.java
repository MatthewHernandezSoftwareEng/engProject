package com.example.thirdattempt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to navigate to the Workouts page
        Button button = findViewById(R.id.timer_start_button);
        EditText usertext = findViewById(R.id.workoutTime);
        EditText clock_display = findViewById(R.id.clock_display);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!button.isActivated()) {
                    timer temp = new timer();
                    temp.count = Integer.parseInt(usertext.getText().toString());
                    System.out.println(Integer.parseInt(usertext.getText().toString()));
                    temp.clock_display = clock_display;
                    temp.runTimer();
                }
                    button.setActivated(true);
}
            }
        });
    }
}