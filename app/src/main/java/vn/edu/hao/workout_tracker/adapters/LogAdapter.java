package vn.edu.hao.workout_tracker.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.models.WorkoutLog;

public class LogAdapter
        extends RecyclerView.Adapter<LogAdapter.LogViewHolder> {

    private List<WorkoutLog> logList;

    public LogAdapter(List<WorkoutLog> logList) {
        this.logList = logList;
    }

    @NonNull
    @Override
    public LogViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType
    ) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_workout_log,
                        parent,
                        false);

        return new LogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull LogViewHolder holder,
            int position
    ) {

        WorkoutLog log = logList.get(position);

        holder.txtExerciseName.setText(
                log.getExerciseName()
        );

        holder.txtMuscleGroup.setText(
                log.getMuscleGroup()
        );

        holder.txtWeightReps.setText(
                log.getWeight() + "kg x "
                        + log.getReps() + " reps"
        );

        // format ngay gio
        SimpleDateFormat sdf =
                new SimpleDateFormat(
                        "dd/MM/yyyy HH:mm",
                        Locale.getDefault()
                );

        String date = sdf.format(
                new Date(log.getTimestamp())
        );

        holder.txtDate.setText(date);
    }

    @Override
    public int getItemCount() {
        return logList.size();
    }

    public static class LogViewHolder
            extends RecyclerView.ViewHolder {

        TextView txtExerciseName;
        TextView txtMuscleGroup;
        TextView txtWeightReps;
        TextView txtDate;

        public LogViewHolder(@NonNull View itemView) {
            super(itemView);

            txtExerciseName =
                    itemView.findViewById(R.id.txtExerciseName);

            txtMuscleGroup =
                    itemView.findViewById(R.id.txtMuscleGroup);

            txtWeightReps =
                    itemView.findViewById(R.id.txtWeightReps);

            txtDate =
                    itemView.findViewById(R.id.txtDate);
        }
    }
}