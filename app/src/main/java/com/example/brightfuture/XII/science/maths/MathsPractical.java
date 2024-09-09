package com.example.brightfuture.XII.science.maths;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;
import com.example.brightfuture.XII.XIIDocumentUpload;

public class MathsPractical extends AppCompatActivity {


    private EditText computer, physics, chemistry;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_maths_practical);

        computer = findViewById(R.id.computerMarks);
        physics = findViewById(R.id.physicsMarks);
        chemistry = findViewById(R.id.chemistryMarks);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(MathsPractical.this, XIIDocumentUpload.class);
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computer.setText("");
                physics.setText("");
                chemistry.setText("");
            }
        });
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(computer.getText().toString())) {
            Toast.makeText(this, "Please enter Computer marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(physics.getText().toString())) {
            Toast.makeText(this, "Please enter Physics marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(chemistry.getText().toString())) {
            Toast.makeText(this, "Please enter Chemistry marks", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }
}