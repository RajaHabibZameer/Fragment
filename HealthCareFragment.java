package com.example.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragment.R;

public class HealthCareFragment extends Fragment {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_health_care, container, false);

        // Ensure the view is not null
        if (view != null) {
            textView = view.findViewById(R.id.textView);
            textView.setText("Hello from HealthCareFragment");
        }

        return view;
    }
}