package vn.edu.hao.workout_tracker.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.adapters.LogAdapter;
import vn.edu.hao.workout_tracker.models.WorkoutLog;

public class LogFragment extends Fragment {

    private RecyclerView recyclerLogs;

    private View layoutEmpty;
    private ArrayList<WorkoutLog> logList;
    private LogAdapter adapter;
    private DatabaseReference databaseReference;

    public LogFragment() {}

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragment_log, container, false);

        recyclerLogs = view.findViewById(R.id.recyclerLogs);

        layoutEmpty = view.findViewById(R.id.layoutEmpty);

        recyclerLogs.setLayoutManager(
                new LinearLayoutManager(getContext())
        );

        logList = new ArrayList<>();

        recyclerLogs.setAdapter(adapter);

        // Lay log theo user hien tai
        FirebaseAuth mAuth = FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() == null) {
            return view;
        }

        String uid = mAuth.getCurrentUser().getUid();

        databaseReference = FirebaseDatabase
                .getInstance()
                .getReference("workout_logs")
                .child(uid);

        // Tao adapter sau khi co databaseReference
        adapter = new LogAdapter(
                logList,
                databaseReference
        );

        recyclerLogs.setAdapter(adapter);

        loadWorkoutLogs();

        return view;
    }

    private void loadWorkoutLogs() {

        databaseReference.addValueEventListener(
                new ValueEventListener() {

                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        // Xoa list cu de load lai data moi
                        logList.clear();

                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                            WorkoutLog log =
                                    dataSnapshot.getValue(WorkoutLog.class);

                            if (log != null) {

                                // Lay Firebase key lam logId
                                log.setLogId(dataSnapshot.getKey());

                                logList.add(log);
                            }
                        }

                        // Sort log moi nhat len dau
                        Collections.sort(
                                logList,
                                (log1, log2) ->
                                        Long.compare(
                                                log2.getTimestamp(),
                                                log1.getTimestamp()
                                        )
                        );

                        // Refresh RecyclerView
                        adapter.notifyDataSetChanged();

                        // Kiem tra list rong hay khong
                        if (logList.isEmpty()) {

                            // Hien empty state
                            layoutEmpty.setVisibility(View.VISIBLE);

                            // An RecyclerView
                            recyclerLogs.setVisibility(View.GONE);

                        } else {

                            // Co data thi hien RecyclerView
                            layoutEmpty.setVisibility(View.GONE);

                            recyclerLogs.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                }
        );
    }
}