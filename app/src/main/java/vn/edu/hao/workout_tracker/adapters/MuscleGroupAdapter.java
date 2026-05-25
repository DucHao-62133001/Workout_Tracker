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
import vn.edu.hao.workout_tracker.models.MuscleGroup;

public class MuscleGroupAdapter extends RecyclerView.Adapter<MuscleGroupAdapter.MuscleViewHolder> {

    // list nhom co
    ArrayList<MuscleGroup> muscleList;
    OnItemClickListener listener;

    // constructor
    public MuscleGroupAdapter(ArrayList<MuscleGroup> muscleList) {
        this.muscleList = muscleList;
    }
    // interface bat su kien click item
    public interface OnItemClickListener {
        void onItemClick(MuscleGroup muscleGroup);
    }

    // ham gan listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MuscleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // gan layout item vao recycler view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_exercise, parent, false);

        return new MuscleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MuscleViewHolder holder, int position) {

        // lay nhom co hien tai
        MuscleGroup muscle = muscleList.get(position);

        // set du lieu len item
        holder.txtName.setText(muscle.getName());

        holder.txtTotal.setText(muscle.getTotalExercises());

        holder.imgMuscle.setImageResource(muscle.getImageResId());
        // bat su kien click item
        holder.itemView.setOnClickListener(v -> {

            if (listener != null) {
                listener.onItemClick(muscle);
            }

        });
    }

    @Override
    public int getItemCount() {

        // tra ve so luong item
        return muscleList.size();
    }

    public static class MuscleViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMuscle;
        TextView txtName, txtTotal;

        public MuscleViewHolder(@NonNull View itemView) {
            super(itemView);

            // anh xa view
            imgMuscle = itemView.findViewById(R.id.imgExercise);

            txtName = itemView.findViewById(R.id.txtExerciseName);

            txtTotal = itemView.findViewById(R.id.txtMuscleGroup);
        }
    }
}