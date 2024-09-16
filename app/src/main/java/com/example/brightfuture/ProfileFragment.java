package com.example.brightfuture;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    private EditText etName, etMobile, etWhatsapp, etInterest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Initialize EditText fields
        etName = view.findViewById(R.id.etName);
        etMobile = view.findViewById(R.id.etMobile);
        etWhatsapp = view.findViewById(R.id.etWhatsapp);
        etInterest = view.findViewById(R.id.etInterest);

        // Load data from SharedPreferences
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("UserProfile", getActivity().MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String mobileNo = sharedPreferences.getString("mobileNo", "");
        String whatsAppNo = sharedPreferences.getString("whatsApp", "");
        String interest = sharedPreferences.getString("hobby", "");

        // Set the data to EditText fields
        etName.setText(name);
        etMobile.setText(mobileNo);
        etWhatsapp.setText(whatsAppNo);
        etInterest.setText(interest);

        return view;
    }
}
