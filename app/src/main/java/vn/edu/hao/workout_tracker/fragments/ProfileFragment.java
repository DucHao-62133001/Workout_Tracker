package vn.edu.hao.workout_tracker.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import vn.edu.hao.workout_tracker.activities.LoginActivity;
import vn.edu.hao.workout_tracker.R;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileFragment extends Fragment {

    private TextView txtEmail, txtBMIResult;
    private EditText edtWeight, edtHeight;
    private Button btnLogout, btnCalcBMI;

    private FirebaseAuth mAuth;
    private TextView txtTotalWorkouts;
    private DatabaseReference databaseReference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        // Firebase
        mAuth = FirebaseAuth.getInstance();

        // ánh xạ
        txtEmail = view.findViewById(R.id.txtEmail);
        txtBMIResult = view.findViewById(R.id.txtBMIResult);
        txtTotalWorkouts = view.findViewById(R.id.txtTotalWorkouts);
        edtWeight = view.findViewById(R.id.edtWeight);
        edtHeight = view.findViewById(R.id.edtHeight);
        btnLogout = view.findViewById(R.id.btnLogout);
        btnCalcBMI = view.findViewById(R.id.btnCalcBMI);

        // HIỂN THỊ EMAIL USER
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {

            txtEmail.setText(
                    "Email: " + user.getEmail()
            );

            // Firebase reference workout logs
            databaseReference = FirebaseDatabase
                    .getInstance()
                    .getReference("workout_logs")
                    .child(user.getUid());

            // Dem tong workout
            databaseReference.addValueEventListener(
                    new ValueEventListener() {

                        @Override
                        public void onDataChange(DataSnapshot snapshot) {

                            int total = (int) snapshot.getChildrenCount();

                            txtTotalWorkouts.setText(
                                    "Tổng số lần tập: " + total
                            );
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }
                    }
            );
        }

        // LOGOUT
        btnLogout.setOnClickListener(v -> {

            mAuth.signOut();

            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);

            requireActivity().finish();
        });

        // BMI CALCULATOR
        btnCalcBMI.setOnClickListener(v -> {

            String w = edtWeight.getText().toString().trim();
            String h = edtHeight.getText().toString().trim();

            if (w.isEmpty() || h.isEmpty()) {
                Toast.makeText(getContext(), "Nhập đầy đủ", Toast.LENGTH_SHORT).show();
                return;
            }

            float weight = Float.parseFloat(w);
            float height = Float.parseFloat(h) / 100; // cm → m

            float bmi = weight / (height * height);

            String status;

// Phan loai BMI
            if (bmi < 18.5f) {

                status = "Thiếu cân";

            } else if (bmi < 25f) {

                status = "Cân nặng bình thường";

            } else if (bmi < 30f) {

                status = "Thừa Cân";

            } else {

                status = "Béo Phì";
            }

// Hien ket qua BMI + status
            txtBMIResult.setText(
                    "BMI: "
                            + String.format("%.2f", bmi)
                            + "\n"
                            + status
            );
        });

        return view;
    }
}