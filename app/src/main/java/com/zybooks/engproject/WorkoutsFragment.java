package com.zybooks.engproject;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.Gravity;

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
        imgButton1 = view.findViewById(R.id.basic_workout_1);
        imgButton2 = view.findViewById(R.id.basic_workout_2);
        imgButton3 = view.findViewById(R.id.basic_workout_3);
        imgButton4 = view.findViewById(R.id.basic_workout_4);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.basic_workout_1_title);
                String description = getString(R.string.basic_workout_1_description);
                showPopupWindow(v, title, description);
            }
        });

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.basic_workout_2_title);
                String description = getString(R.string.basic_workout_2_description);
                showPopupWindow(v, title, description);
            }
        });

        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.basic_workout_3_title);
                String description = getString(R.string.basic_workout_3_description);
                showPopupWindow(v, title, description);
            }
        });

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.basic_workout_4_title);
                String description = getString(R.string.basic_workout_4_description);
                showPopupWindow(v, title, description);
            }
        });
        return view;
    }

    private void showPopupWindow(View view, String titleText, String descriptionText) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_design, null);

        final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

        TextView titleTextView = popupView.findViewById(R.id.popupTitle);
        titleTextView.setText(titleText);

        TextView descriptionTextView = popupView.findViewById(R.id.popupDescription);
        descriptionTextView.setText(descriptionText);

        ImageButton closeButton = popupView.findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }

}
