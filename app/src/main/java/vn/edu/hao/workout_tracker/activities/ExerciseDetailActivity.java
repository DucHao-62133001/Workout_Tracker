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

import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.adapters.ImageSliderAdapter;

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
    //private ImageView imgExercise;

    // Data
    private String exerciseName;
    private String muscleGroup;

    private TextView txtMuscleGroup;

    //tips
    private TextView txtTips;

    // wipe ảnh
    private ViewPager2 viewPagerImages;

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
        viewPagerImages = findViewById(R.id.viewPagerImages);
        //imgExercise = findViewById(R.id.imgExercise);
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
        ArrayList<Integer> imageList = new ArrayList<>();

        // Ngực
        if (exerciseName.equals("Bench Press")) {
            imageList.add(R.drawable.bench_press_1);
            imageList.add(R.drawable.bench_press_2);
        }
        else if (exerciseName.equals("Incline Dumbell Press")) {
            imageList.add(R.drawable.inclinedb_1);
            imageList.add(R.drawable.inclinedb_2);
        }
        else if (exerciseName.equals("Incline Press")) {
            imageList.add(R.drawable.incline_1);
            imageList.add(R.drawable.incline_2);
        }
        else if (exerciseName.equals("Dumbbell Flys")) {
            imageList.add(R.drawable.db_fly_1);
            imageList.add(R.drawable.db_fly_2);
        }
        else if (exerciseName.equals("Pec Deck Flies")) {
            imageList.add(R.drawable.pec_dec_1);
            imageList.add(R.drawable.pec_dec_2);
        }
        else if (exerciseName.equals("Push up")) {
            imageList.add(R.drawable.push_up_1);
            imageList.add(R.drawable.push_up_2);
        }
        else if (exerciseName.equals("Decline Bench Press")) {
            imageList.add(R.drawable.decline_1);
            imageList.add(R.drawable.decline_2);
        }
        else if (exerciseName.equals("High To Low Cable Fly")) {
            imageList.add(R.drawable.cable_fly_1);
            imageList.add(R.drawable.cable_fly_2);
        }
        else if (exerciseName.equals("Chest Dips")) {
            imageList.add(R.drawable.dips_1);
            imageList.add(R.drawable.dips_2);
        }



        // Bụng
        else if (exerciseName.equals("Crunch")) {
            imageList.add(R.drawable.crunch_2);
            imageList.add(R.drawable.crunch_1);
            imageList.add(R.drawable.crunch_3);
        }
        else if (exerciseName.equals("Leg Raise")) {
            imageList.add(R.drawable.leg_raise_1);
            imageList.add(R.drawable.leg_raise_2);
        }

        // Lưng
        else if (exerciseName.equals("Pull Up")) {
            imageList.add(R.drawable.pull_up_1);
            imageList.add(R.drawable.pull_up_2);
        }
        else if (exerciseName.equals("Lat Pulldown")) {
            imageList.add(R.drawable.lat_pulldown_1);
            imageList.add(R.drawable.lat_pulldown_2);
        }

        // Chân
        else if (exerciseName.equals("Squat")) {
            imageList.add(R.drawable.squat_1);
            imageList.add(R.drawable.squat_2);
        }
        else if (exerciseName.equals("Leg Press")) {
            imageList.add(R.drawable.leg_press_1);
            imageList.add(R.drawable.leg_press_2);
        }

        //  Cẳng chân
        else if (exerciseName.equals("Standing Calf Raise")) {
            imageList.add(R.drawable.standing_calf_1);
            imageList.add(R.drawable.standing_calf_2);
        }
        else if (exerciseName.equals("Seated Calf Raise")) {
            imageList.add(R.drawable.seated_calf_1);
            imageList.add(R.drawable.seated_calf_2);
        }

        // Cánh tay
        else if (exerciseName.equals("Hammer Curl")) {
            imageList.add(R.drawable.hammer_curl_1);
            imageList.add(R.drawable.hammer_curl_2);
        }
        else if (exerciseName.equals("Reverse Curl")) {
            imageList.add(R.drawable.reverse_curl_1);
            imageList.add(R.drawable.reverse_curl_2);
        }

        // Tay trước
        else if (exerciseName.equals("Barbell Curl")) {
            imageList.add(R.drawable.barbell_curl_1);
            imageList.add(R.drawable.barbell_curl_2);
        }
        else if (exerciseName.equals("Concentration Curl")) {
            imageList.add(R.drawable.concentration_curl_1);
            imageList.add(R.drawable.concentration_curl_2);
        }

        // Tay sau
        else if (exerciseName.equals("Tricep Pushdown")) {
            imageList.add(R.drawable.triceps_pushdown_1);
            imageList.add(R.drawable.triceps_pushdown_2);
        }
        else if (exerciseName.equals("Overhead Extension")) {
            imageList.add(R.drawable.overhead_extension_1);
            imageList.add(R.drawable.overhead_extension_2);
        }

        // Vai
        else if (exerciseName.equals("Shoulder Press")) {
            imageList.add(R.drawable.shoulder_press_1);
            imageList.add(R.drawable.shoulder_press_2);
        }
        else if (exerciseName.equals("Lateral Raise")) {
            imageList.add(R.drawable.lateral_raise_1);
            imageList.add(R.drawable.lateral_raise_2);
        }
        else {

            imageList.add(imageResId);

        }
        String tips = getIntent().getStringExtra("exercise_tips");

        txtExerciseName.setText(exerciseName);
        txtDescription.setText(description);
        //imgExercise.setImageResource(imageResId);
        txtMuscleGroup.setText(muscleGroup);
        txtTips.setText(tips);
        ImageSliderAdapter sliderAdapter =
                new ImageSliderAdapter(imageList);

        viewPagerImages.setAdapter(sliderAdapter);


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