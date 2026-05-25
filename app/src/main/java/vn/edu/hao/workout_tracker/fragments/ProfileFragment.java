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

public class ProfileFragment extends Fragment {

    private TextView txtEmail, txtBMIResult;
    private EditText edtWeight, edtHeight;
    private Button btnLogout, btnCalcBMI;

    private FirebaseAuth mAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        // Firebase
        mAuth = FirebaseAuth.getInstance();

        // ánh xạ
        txtEmail = view.findViewById(R.id.txtEmail);
        txtBMIResult = view.findViewById(R.id.txtBMIResult);
        edtWeight = view.findViewById(R.id.edtWeight);
        edtHeight = view.findViewById(R.id.edtHeight);
        btnLogout = view.findViewById(R.id.btnLogout);
        btnCalcBMI = view.findViewById(R.id.btnCalcBMI);

        // HIỂN THỊ EMAIL USER
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            txtEmail.setText("Email: " + user.getEmail());
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

            txtBMIResult.setText("BMI: " + String.format("%.2f", bmi));
        });

        return view;
    }
}