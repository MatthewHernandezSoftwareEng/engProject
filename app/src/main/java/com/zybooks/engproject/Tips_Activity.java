package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tips_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tips_activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button pushup_button = findViewById(R.id.pushup_button);
        pushup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tips_Activity.this, pushup.class);
                startActivity(intent);
            }
        });

        Button squat_button = findViewById(R.id.squat_button);
        squat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, squat.class);
                startActivity(intent);
            }
        });
        Button plank_button = findViewById(R.id.plank_button);
        plank_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, plank.class);
                startActivity(intent);
            }
        });
        Button jumpjack_button = findViewById(R.id.jumpjack_button);
        jumpjack_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, jumpingjacks.class);
                startActivity(intent);
            }
        });
        Button lunge_button = findViewById(R.id.lunge_button);
        lunge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, lunge.class);
                startActivity(intent);
            }
        });
        Button situp_button = findViewById(R.id.situp_button);
        situp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, situp.class);
                startActivity(intent);
            }
        });
        Button highknees_button = findViewById(R.id.highknee_button);
        highknees_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, highknee.class);
                startActivity(intent);
            }
        });
        Button calfrasiae_button = findViewById(R.id.calfraise_button);
        calfrasiae_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent = new Intent(Tips_Activity.this, calfraise.class);
                startActivity(intent);
            }
        });
    }
}