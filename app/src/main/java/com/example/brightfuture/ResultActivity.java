package com.example.brightfuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setChildLayout(R.layout.activity_result);

        TextView resultMessageTextView = findViewById(R.id.resultMessageTextView);
        Button exitButton = findViewById(R.id.exitButton);

        // Get the score and result message from the intent
        Intent intent = getIntent();
        String resultMessage = intent.getStringExtra("resultMessage");
        int finalScore = intent.getIntExtra("score", 0);

        // Set the result message and final score
        resultMessageTextView.setText("Your final score is: " + finalScore + " points\n" + resultMessage);

        // Handle the exit button click

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();  // Close all activities
                System.exit(0);
            }
        });

    }
}
