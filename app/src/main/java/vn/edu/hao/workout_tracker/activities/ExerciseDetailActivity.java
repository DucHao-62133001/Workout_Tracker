package vn.edu.hao.workout_tracker.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.models.WorkoutLog;

public class ExerciseDetailActivity extends AppCompatActivity {

    // Firebase
    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;
    private String uid;

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

    // Data
    private String exerciseName;
    private String muscleGroup;

    private TextView txtMuscleGroup;

    //tips
    private TextView txtTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        // FIREBASE AUTH + CHECK USER
        mAuth = FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() == null) {
            Toast.makeText(this, "Chưa đăng nhập", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }
        uid = mAuth.getCurrentUser().getUid();

        //DATABASE
        // workout_logs / uid

        databaseReference = FirebaseDatabase
                .getInstance()
                .getReference("workout_logs")
                .child(uid);


        // ÁNH XẠ VIEW

        btnBack = findViewById(R.id.btnBack);
        txtExerciseName = findViewById(R.id.txtExerciseName);
        txtDescription = findViewById(R.id.txtDescription);
        imgExercise = findViewById(R.id.imgExercise);
        txtTips = findViewById(R.id.txtTips);

        edtWeight = findViewById(R.id.edtWeight);
        edtReps = findViewById(R.id.edtReps);
        btnSaveLog = findViewById(R.id.btnSaveLog);

        txtMuscleGroup = findViewById(R.id.txtMuscleGroup);


        // GET DATA INTENT

        exerciseName = getIntent().getStringExtra("exercise_name");
        muscleGroup = getIntent().getStringExtra("muscle_group");

        String description = getIntent().getStringExtra("exercise_description");
        int imageResId = getIntent().getIntExtra("exercise_image", 0);
        String tips = getIntent().getStringExtra("exercise_tips");

        txtExerciseName.setText(exerciseName);
        txtDescription.setText(description);
        imgExercise.setImageResource(imageResId);
        txtMuscleGroup.setText(muscleGroup);
        txtTips.setText(tips);


        // BACK BUTTON

        btnBack.setOnClickListener(v -> finish());

        //SAVE LOG
        btnSaveLog.setOnClickListener(v -> {

            String weight = edtWeight.getText().toString().trim();
            String reps = edtReps.getText().toString().trim();

            if (weight.isEmpty() || reps.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ", Toast.LENGTH_SHORT).show();
                return;
            }
            // tạo log
            WorkoutLog workoutLog = new WorkoutLog(
                    exerciseName,
                    muscleGroup,
                    weight,
                    reps,
                    System.currentTimeMillis()
            );
            // tạo id
            String logId = databaseReference.push().getKey();
            if (logId == null) {
                Toast.makeText(this, "Lỗi tạo ID", Toast.LENGTH_SHORT).show();
                return;
            }

            // save firebase
            databaseReference.child(logId)
                    .setValue(workoutLog)
                    .addOnSuccessListener(unused -> {

                        Toast.makeText(this, "Thành công", Toast.LENGTH_SHORT).show();

                        edtWeight.setText("");
                        edtReps.setText("");

                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(this, "Lỗi lưu dữ liệu", Toast.LENGTH_SHORT).show();
                    });
        });
    }
}