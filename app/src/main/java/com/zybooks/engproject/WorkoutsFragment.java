package com.zybooks.engproject;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.PopupWindow;
import android.view.MotionEvent;

public class WorkoutsFragment extends Fragment {

    public WorkoutsFragment() {
        // Required empty public constructor
    }

    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton3;
    ImageButton imgButton4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workouts, container, false);

        // Set up button click listeners
        imgButton1 = (ImageButton) view.findViewById(R.id.basic_workout_1);
        imgButton2 = (ImageButton) view.findViewById(R.id.basic_workout_2);
        imgButton3 = (ImageButton) view.findViewById(R.id.basic_workout_3);
        imgButton4 = (ImageButton) view.findViewById(R.id.basic_workout_4);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Basic Workout 1");
            }
        });

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Basic Workout 2");
            }
        });

        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Basic Workout 3");
            }
        });

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Basic Workout 4");
            }
        });

        return view;
    }

    private void onWorkoutButtonClick(String workoutName) {
        String message = workoutName + " Selected";
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();

        // You can add more functionality here based on the selected workout
    }
}
