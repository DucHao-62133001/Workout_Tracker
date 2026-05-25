package vn.edu.hao.workout_tracker.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.adapters.ExerciseAdapter;
import vn.edu.hao.workout_tracker.data.ExerciseData;
import vn.edu.hao.workout_tracker.models.Exercise;
import vn.edu.hao.workout_tracker.adapters.MuscleGroupAdapter;
import vn.edu.hao.workout_tracker.models.MuscleGroup;
import android.content.Intent;

import vn.edu.hao.workout_tracker.activities.ExerciseListActivity;

public class ExercisesFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<MuscleGroup> muscleList;
    MuscleGroupAdapter adapter;

    public ExercisesFragment() {

        // constructor rong bat buoc cho fragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // gan layout cho fragment
        View view = inflater.inflate(R.layout.fragment_exercises, container, false);

        // anh xa recycler view
        recyclerView = view.findViewById(R.id.recyclerExercises);

        // lay data bai tap
        muscleList = ExerciseData.getMuscleGroups();

        // tao adapter
        adapter = new MuscleGroupAdapter(muscleList);

        // set layout cho recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // gan adapter vao recycler view
        recyclerView.setAdapter(adapter);
        // xu ly click nhom co
        adapter.setOnItemClickListener(muscleGroup -> {

            Intent intent = new Intent(getContext(), ExerciseListActivity.class);

            // gui ten nhom co sang activity moi
            intent.putExtra("muscle_name", muscleGroup.getName());

            startActivity(intent);

        });

        return view;
    }
}