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

import java.util.Calendar;

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

        // Format ngay gio
        SimpleDateFormat sdf =
                new SimpleDateFormat(
                        "dd/MM/yyyy",
                        Locale.getDefault()
                );

        String date = sdf.format(
                new Date(log.getTimestamp())
        );

        holder.txtDate.setText(date);

        // =========================
        // AN DATE NEU TRUNG NGAY
        // =========================

        if (position > 0) {

            WorkoutLog previousLog =
                    logList.get(position - 1);

            if (isSameDay(log, previousLog)) {

                // Trung ngay thi an txtDate
                holder.txtDate.setVisibility(View.GONE);

            } else {

                // Khac ngay thi hien
                holder.txtDate.setVisibility(View.VISIBLE);
            }

        } else {

            // Item dau tien luon hien date
            holder.txtDate.setVisibility(View.VISIBLE);
        }
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
    private boolean isSameDay(
            WorkoutLog log1,
            WorkoutLog log2
    ) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTimeInMillis(log1.getTimestamp());
        cal2.setTimeInMillis(log2.getTimestamp());

        return cal1.get(Calendar.YEAR)
                == cal2.get(Calendar.YEAR)

                && cal1.get(Calendar.DAY_OF_YEAR)
                == cal2.get(Calendar.DAY_OF_YEAR);
    }
}