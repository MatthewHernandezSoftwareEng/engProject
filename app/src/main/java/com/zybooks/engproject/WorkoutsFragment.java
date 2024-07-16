package com.zybooks.engproject;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class WorkoutsFragment extends Fragment {

    public WorkoutsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workouts, container, false);

        // Set up button click listeners
        Button buttonPushups = view.findViewById(R.id.button_pushups);
        Button buttonSitups = view.findViewById(R.id.button_situps);
        Button buttonSquats = view.findViewById(R.id.button_squats);
        Button buttonLunges = view.findViewById(R.id.button_lunges);

        buttonPushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Push-ups");
            }
        });

        buttonSitups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Sit-ups");
            }
        });

        buttonSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Squats");
            }
        });

        buttonLunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWorkoutButtonClick("Lunges");
            }
        });

        return view;
    }

    private void onWorkoutButtonClick(String workoutName) {
        String message = workoutName + " selected";
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();

        // You can add more functionality here based on the selected workout
    }
}
