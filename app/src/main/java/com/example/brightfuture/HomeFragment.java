package com.example.brightfuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.brightfuture.X.XActivity;
import com.example.brightfuture.XII.XIIActivity;

public class HomeFragment extends Fragment {

    // Fragment initialization parameters
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the buttons
        Button xButton = view.findViewById(R.id.X_button);
        Button xiiButton = view.findViewById(R.id.XII_button);

        // Set click listener for X button
        xButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), XActivity.class);
            startActivity(intent);
        });

        // Set click listener for XII button
        xiiButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), XIIActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
