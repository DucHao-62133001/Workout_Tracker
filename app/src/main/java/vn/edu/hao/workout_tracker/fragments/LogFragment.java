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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.adapters.LogAdapter;
import vn.edu.hao.workout_tracker.models.WorkoutLog;

public class LogFragment extends Fragment {

    private RecyclerView recyclerLogs;

    private ArrayList<WorkoutLog> logList;

    private LogAdapter adapter;

    private DatabaseReference databaseReference;

    public LogFragment() {
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(
                R.layout.fragment_log,
                container,
                false
        );

        // anh xa
        recyclerLogs =
                view.findViewById(R.id.recyclerLogs);

        // recyclerview
        recyclerLogs.setLayoutManager(
                new LinearLayoutManager(getContext())
        );

        logList = new ArrayList<>();

        adapter = new LogAdapter(logList);

        recyclerLogs.setAdapter(adapter);

        // firebase
        databaseReference = FirebaseDatabase
                .getInstance()
                .getReference("workout_logs");

        // load data
        loadWorkoutLogs();

        return view;
    }

    private void loadWorkoutLogs() {

        databaseReference.addValueEventListener(
                new ValueEventListener() {

                    @Override
                    public void onDataChange(
                            @NonNull DataSnapshot snapshot
                    ) {

                        logList.clear();

                        for (DataSnapshot dataSnapshot
                                : snapshot.getChildren()) {

                            WorkoutLog log =
                                    dataSnapshot.getValue(
                                            WorkoutLog.class
                                    );

                            logList.add(log);
                        }

                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onCancelled(
                            @NonNull DatabaseError error
                    ) {

                    }
                });
    }
}