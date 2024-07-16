package com.zybooks.engproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder> {

    private List<Workout> workoutList;

    public WorkoutAdapter(List<Workout> workoutList) {
        this.workoutList = workoutList;
    }

    @NonNull
    @Override
    public WorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_workout_button_1, parent, false);
        return new WorkoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewHolder holder, int position) {
        Workout workout = workoutList.get(position);
        holder.workoutTitle.setText(workout.getName());
        // If your Workout class has an image resource ID, uncomment the next line and set it appropriately
        // holder.workoutImage.setImageResource(workout.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return workoutList.size();
    }

    public static class WorkoutViewHolder extends RecyclerView.ViewHolder {

        ImageView workoutImage;
        TextView workoutTitle;

        public WorkoutViewHolder(View itemView) {
            super(itemView);
            workoutImage = itemView.findViewById(R.id.workout_image);
            workoutTitle = itemView.findViewById(R.id.workout_title);
        }
    }
}
