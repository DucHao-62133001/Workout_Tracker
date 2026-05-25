package vn.edu.hao.workout_tracker.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.models.WorkoutLog;

public class ExerciseDetailActivity extends AppCompatActivity {

    // Firebase
    private DatabaseReference databaseReference;

    // Input
    private EditText edtWeight;
    private EditText edtReps;

    // Button
    private Button btnSaveLog;

    // UI
    private TextView btnBack;
    private TextView txtExerciseName;
    private TextView txtDescription;

    private ImageView imgExercise;

    // Data global
    private String exerciseName;
    private String muscleGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // gan layout
        setContentView(R.layout.activity_exercise_detail);

        // Firebase
        databaseReference = FirebaseDatabase
                .getInstance()
                .getReference("workout_logs");

        // anh xa view
        btnBack = findViewById(R.id.btnBack);

        txtExerciseName = findViewById(R.id.txtExerciseName);

        txtDescription = findViewById(R.id.txtDescription);

        imgExercise = findViewById(R.id.imgExercise);

        edtWeight = findViewById(R.id.edtWeight);

        edtReps = findViewById(R.id.edtReps);

        btnSaveLog = findViewById(R.id.btnSaveLog);

        // lay data tu intent
        exerciseName = getIntent().getStringExtra("exercise_name");

        muscleGroup = getIntent().getStringExtra("muscle_group");

        String description =
                getIntent().getStringExtra("exercise_description");

        int imageResId =
                getIntent().getIntExtra("exercise_image", 0);

        // hien data len ui
        txtExerciseName.setText(exerciseName);

        txtDescription.setText(description);

        imgExercise.setImageResource(imageResId);

        // nut back
        btnBack.setOnClickListener(v -> {
            finish();
        });

        // save log
        btnSaveLog.setOnClickListener(v -> {

            String weight =
                    edtWeight.getText().toString().trim();

            String reps =
                    edtReps.getText().toString().trim();

            // kiem tra rong
            if (weight.isEmpty() || reps.isEmpty()) {

                Toast.makeText(
                        ExerciseDetailActivity.this,
                        "Vui lòng nhập đầy đủ",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            // tao object log
            WorkoutLog workoutLog = new WorkoutLog(
                    exerciseName,
                    muscleGroup,
                    weight,
                    reps,
                    System.currentTimeMillis()
            );

            // tao id firebase
            String logId =
                    databaseReference.push().getKey();

            // save firebase
            databaseReference
                    .child(logId)
                    .setValue(workoutLog)
                    .addOnSuccessListener(unused -> {

                        Toast.makeText(
                                ExerciseDetailActivity.this,
                                "Thành Công",
                                Toast.LENGTH_SHORT
                        ).show();

                        // clear input
                        edtWeight.setText("");

                        edtReps.setText("");
                    })
                    .addOnFailureListener(e -> {

                        Toast.makeText(
                                ExerciseDetailActivity.this,
                                "Lỗi",
                                Toast.LENGTH_SHORT
                        ).show();
                    });
        });
    }
}