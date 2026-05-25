package vn.edu.hao.workout_tracker.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.hao.workout_tracker.R;

import android.view.View;

public class ExerciseListActivity extends AppCompatActivity {

    TextView txtTitle, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // gan layout
        setContentView(R.layout.activity_exercise_list);

        // anh xa text view
        txtTitle = findViewById(R.id.txtTitle);
        btnBack = findViewById(R.id.btnBack);

        // lay ten nhom co tu fragment gui sang
        String muscleName = getIntent().getStringExtra("muscle_name");

        // hien title len man hinh
        txtTitle.setText(muscleName);
        // xu ly nut back
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}