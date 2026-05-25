package vn.edu.hao.workout_tracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import vn.edu.hao.workout_tracker.fragments.ExercisesFragment;
import vn.edu.hao.workout_tracker.fragments.LogFragment;
import vn.edu.hao.workout_tracker.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        loadFragment(new ExercisesFragment());

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