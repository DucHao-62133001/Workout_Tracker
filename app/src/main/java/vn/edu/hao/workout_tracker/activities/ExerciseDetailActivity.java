package vn.edu.hao.workout_tracker.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.hao.workout_tracker.R;

public class ExerciseDetailActivity extends AppCompatActivity {

    TextView btnBack;
    TextView txtExerciseName;
    TextView txtDescription;

    ImageView imgExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // gan layout
        setContentView(R.layout.activity_exercise_detail);

        // anh xa view
        btnBack = findViewById(R.id.btnBack);

        txtExerciseName = findViewById(R.id.txtExerciseName);

        txtDescription = findViewById(R.id.txtDescription);

        imgExercise = findViewById(R.id.imgExercise);

        // lay data tu activity truoc gui sang
        String name = getIntent().getStringExtra("exercise_name");

        String description = getIntent().getStringExtra("exercise_description");

        int imageResId = getIntent().getIntExtra("exercise_image", 0);

        // hien data len ui
        txtExerciseName.setText(name);

        txtDescription.setText(description);

        imgExercise.setImageResource(imageResId);

        // xu ly nut back
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}