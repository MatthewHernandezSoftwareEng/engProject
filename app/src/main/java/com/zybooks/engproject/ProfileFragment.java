package com.zybooks.engproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class ProfileFragment extends Fragment {

    private TextView nameText;
    private EditText heightInput;
    private EditText weightInput;
    private TextView resultText;
    private TextView dayOfWeekText;
    private TextView streakText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(root);

        Button calculateButton = root.findViewById(R.id.calculateButton);
        nameText = root.findViewById(R.id.nameText);
        heightInput = root.findViewById(R.id.heightInput);
        weightInput = root.findViewById(R.id.weightInput);
        resultText = root.findViewById(R.id.resultText);
        dayOfWeekText = root.findViewById(R.id.dayOfWeekText);
        streakText = root.findViewById(R.id.streakText);

        calculateButton.setOnClickListener(this::calculateBMI);

        updateDayOfWeek();

        SharedPreferences prefs = getActivity().getSharedPreferences("MyApp", getActivity().MODE_PRIVATE);
        String name = prefs.getString("name", null);
        if (name == null) {
            // The app hasn't been opened before, so show the dialog
            showNameDialog();
        } else {
            // The app has been opened before, so display the name
            nameText.setText("Hello, " + name + "!");

            // Check if the user has opened the app today
            long lastOpened = prefs.getLong("lastOpened", 0);
            Calendar lastOpenedCal = Calendar.getInstance();
            lastOpenedCal.setTimeInMillis(lastOpened);

            Calendar today = Calendar.getInstance();

            int streak = prefs.getInt("streak", 0);

            if (lastOpenedCal.get(Calendar.YEAR) == today.get(Calendar.YEAR) &&
                    lastOpenedCal.get(Calendar.DAY_OF_YEAR) == today.get(Calendar.DAY_OF_YEAR)) {
                // The user has already opened the app today, so do nothing
            } else if (lastOpenedCal.get(Calendar.YEAR) == today.get(Calendar.YEAR) &&
                    lastOpenedCal.get(Calendar.DAY_OF_YEAR) == today.get(Calendar.DAY_OF_YEAR) - 1) {
                // The user opened the app yesterday, so increment the streak
                streak++;
            } else {
                // The user did not open the app yesterday, so reset the streak
                streak = 1;
            }

            // Save the streak and the current date
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("streak", streak);
            editor.putLong("lastOpened", today.getTimeInMillis());
            editor.apply();

            // Display the streak
            streakText.setText("You have used the app for " + streak + " consecutive days!");
        }

        return scrollView;
    }

    public void calculateBMI(View view) {
        String heightStr = heightInput.getText().toString();
        String weightStr = weightInput.getText().toString();

        if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
            float heightInInches = Float.parseFloat(heightStr);
            float weightInPounds = Float.parseFloat(weightStr);

            float bmi = (weightInPounds / (heightInInches * heightInInches)) * 703;

            resultText.setText(String.format("Your BMI is %.2f", bmi));
        }
    }

    private void updateDayOfWeek() {
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        dayOfWeekText.setText("Today is " + days[day - 1]);
    }

    private void showNameDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), androidx.appcompat.R.color.background_material_dark);
        builder.setTitle("Enter your name");

        EditText input = new EditText(getActivity());
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = input.getText().toString();

                // Save the name for future use
                SharedPreferences.Editor editor = getActivity().getSharedPreferences("MyApp", getActivity().MODE_PRIVATE).edit();
                editor.putString("name", name);
                editor.apply();

                // Display the name
                nameText.setText("Hello, " + name + "!");
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
}
