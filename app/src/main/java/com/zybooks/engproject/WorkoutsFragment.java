package com.zybooks.engproject;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class WorkoutsFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Workout> workoutList;

    public WorkoutsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workouts, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.workouts_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Prepare workout data
        workoutList = new ArrayList<>();
        workoutList.add(new Workout("Push-ups", "A basic upper body exercise"));
        workoutList.add(new Workout("Sit-ups", "An abdominal exercise to strengthen the core"));
        workoutList.add(new Workout("Squats", "A lower body exercise for legs and glutes"));
        workoutList.add(new Workout("Lunges", "A lower body exercise targeting the legs and glutes"));

        // Set up RecyclerView adapter
        WorkoutAdapter adapter = new WorkoutAdapter(workoutList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
