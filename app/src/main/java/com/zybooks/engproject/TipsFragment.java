package com.zybooks.engproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class TipsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tips_activity_main, container, false);

        // Apply window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(view.findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button pushup_button = view.findViewById(R.id.pushup_button);
        pushup_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), pushup.class);
            startActivity(intent);
        });

        Button squat_button = view.findViewById(R.id.squat_button);
        squat_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), squat.class);
            startActivity(intent);
        });

        Button plank_button = view.findViewById(R.id.plank_button);
        plank_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), plank.class);
            startActivity(intent);
        });

        Button jumpjack_button = view.findViewById(R.id.jumpjack_button);
        jumpjack_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), jumpingjacks.class);
            startActivity(intent);
        });

        Button lunge_button = view.findViewById(R.id.lunge_button);
        lunge_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), lunge.class);
            startActivity(intent);
        });

        Button situp_button = view.findViewById(R.id.situp_button);
        situp_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), situp.class);
            startActivity(intent);
        });

        Button highknees_button = view.findViewById(R.id.highknee_button);
        highknees_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), highknee.class);
            startActivity(intent);
        });

        Button calfrasiae_button = view.findViewById(R.id.calfraise_button);
        calfrasiae_button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), calfraise.class);
            startActivity(intent);
        });
    }
}
