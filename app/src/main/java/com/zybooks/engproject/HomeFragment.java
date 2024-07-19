package com.zybooks.engproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.timer_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button timer_start_button = view.findViewById(R.id.timer_start_button);
        EditText usertext = view.findViewById(R.id.workoutTime);
        EditText clock_display = view.findViewById(R.id.clock_display);

        timer_start_button.setOnClickListener(v -> {
            if (!timer_start_button.isActivated()) {
                timer_start_button.setActivated(true);
                timer temp = new timer();
                temp.count = Integer.parseInt(usertext.getText().toString());
                System.out.println(Integer.parseInt(usertext.getText().toString()));
                temp.clock_display = clock_display;
                temp.timer_start = timer_start_button;
                temp.runTimer();
            }
        });
    }
}
