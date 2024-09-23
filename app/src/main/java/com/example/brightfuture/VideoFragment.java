package com.example.brightfuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.brightfuture.XII.RegardingSubject;

public class VideoFragment extends Fragment {

    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find buttons by ID and set text with source identifiers
        setupButton(view, R.id.Science12, "Science12");
        setupButton(view, R.id.Science11, "Science11");
        setupButton(view, R.id.commerece12, "Commerce12");
        setupButton(view, R.id.commerece11, "Commerce11");
        setupButton(view, R.id.arts12, "Arts12");
        setupButton(view, R.id.arts11, "Arts11");
    }


    private void setupButton(View view, int buttonId, String source) {
        Button button = view.findViewById(buttonId);

        // Get current text and determine the new text to set
        String currentText = button.getText().toString();
        String newText;

        // Check if the current text ends with "2" or "1"
        if (source.charAt(source.length() - 1) == '2') {
            newText = "12 " + currentText; // Prepend "12"
        } else {
            newText = "11 " + currentText; // Prepend "11"
        }

        button.setText(newText); // Set the new text

        // Set onClick listener to navigate to RegardingSubject activity
        button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RegardingSubject.class);
            intent.putExtra("source", source); // Pass the source
            startActivity(intent);
        });
    }

}
