package vn.edu.hao.workout_tracker.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.hao.workout_tracker.R;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.adapters.ExerciseAdapter;
import vn.edu.hao.workout_tracker.data.ExerciseData;
import vn.edu.hao.workout_tracker.models.Exercise;
import android.content.Intent;
import android.view.View;

public class ExerciseListActivity extends AppCompatActivity {

    TextView txtTitle, btnBack;

    RecyclerView recyclerView;

    ArrayList<Exercise> exerciseList;

    ExerciseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // gan layout
        setContentView(R.layout.activity_exercise_list);

        // anh xa text view
        txtTitle = findViewById(R.id.txtTitle);
        btnBack = findViewById(R.id.btnBack);
        recyclerView = findViewById(R.id.recyclerExerciseList);

        // lay ten nhom co tu fragment gui sang
        String muscleName = getIntent().getStringExtra("muscle_name");

        // hien title len man hinh
        txtTitle.setText(muscleName);
        // lay danh sach bai tap theo nhom co
        exerciseList = ExerciseData.getExercisesByMuscle(muscleName);

        // tao adapter
        adapter = new ExerciseAdapter(exerciseList);

        // set layout recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // gan adapter vao recycler view
        recyclerView.setAdapter(adapter);
        // xu ly click bai tap
        adapter.setOnItemClickListener(exercise -> {

            Intent intent = new Intent(
                    ExerciseListActivity.this,
                    ExerciseDetailActivity.class
            );

            // gui data sang detail
            intent.putExtra("exercise_name", exercise.getName());

            intent.putExtra("exercise_description", exercise.getDescription());

            intent.putExtra("exercise_image", exercise.getImageResId());

            intent.putExtra("muscle_group", muscleName);

            startActivity(intent);
        });
        // xu ly nut back
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}