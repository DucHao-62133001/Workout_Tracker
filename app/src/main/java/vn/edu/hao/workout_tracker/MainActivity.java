package vn.edu.hao.workout_tracker;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import vn.edu.hao.workout_tracker.activities.LoginActivity;
import vn.edu.hao.workout_tracker.fragments.ExercisesFragment;
import vn.edu.hao.workout_tracker.fragments.LogFragment;
import vn.edu.hao.workout_tracker.fragments.ProfileFragment;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    // Firebase Auth (dùng để check user login)
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // KHỞI TẠO FIREBASE AUTH

        mAuth = FirebaseAuth.getInstance();

        // HECK USER LOGIN
        // Nếu chưa login → đá qua LoginActivity
        if (mAuth.getCurrentUser() == null) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        // ET UI MAIN SCREEN
        setContentView(R.layout.activity_main);

        // Bottom navigation
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // LOAD FRAGMENT MẶC ĐỊNH
        loadFragment(new ExercisesFragment());

        // XỬ LÝ BOTTOM NAVIGATION
        bottomNavigationView.setOnItemSelectedListener(item -> {

            Fragment fragment = null;

            if (item.getItemId() == R.id.nav_exercises) {
                fragment = new ExercisesFragment();
            }
            else if (item.getItemId() == R.id.nav_log) {
                fragment = new LogFragment();
            }
            else if (item.getItemId() == R.id.nav_profile) {
                fragment = new ProfileFragment();
            }

            return loadFragment(fragment);
        });
    }

    // FUNCTION LOAD FRAGMENT
    private boolean loadFragment(Fragment fragment) {

        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();

            return true;
        }

        return false;
    }
}