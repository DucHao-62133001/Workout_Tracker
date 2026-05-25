package vn.edu.hao.workout_tracker.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.models.Exercise;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    // list bai tap
    ArrayList<Exercise> exerciseList;
    OnItemClickListener listener;

    // constructor
    public ExerciseAdapter(ArrayList<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
    // interface click item
    public interface OnItemClickListener {
        void onItemClick(Exercise exercise);
    }

    // ham gan listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // gan layout item_exercise vao recycler view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_exercise, parent, false);

        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {

        // lay bai tap tai vi tri hien tai
        Exercise exercise = exerciseList.get(position);

        // set du lieu len item
        holder.txtName.setText(exercise.getName());
        holder.txtMuscle.setText(exercise.getMuscleGroup());
        holder.imgExercise.setImageResource(exercise.getImageResId());
        // bat su kien click item
        holder.itemView.setOnClickListener(v -> {

            if (listener != null) {
                listener.onItemClick(exercise);
            }

        });
    }

    @Override
    public int getItemCount() {

        // so luong item
        return exerciseList.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {

        ImageView imgExercise;
        TextView txtName, txtMuscle;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);

            // anh xa view
            imgExercise = itemView.findViewById(R.id.imgExercise);
            txtName = itemView.findViewById(R.id.txtExerciseName);
            txtMuscle = itemView.findViewById(R.id.txtMuscleGroup);
        }
    }
}