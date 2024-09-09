package com.example.brightfuture.XII.science.biology;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;

public class Biology extends AppCompatActivity {

    private EditText biology, english, physics, chemistry, sanskrit;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_science_biology);

        biology = findViewById(R.id.biologyMarks);
        english = findViewById(R.id.englishMarks);
        physics = findViewById(R.id.physicsMarks);
        chemistry = findViewById(R.id.chemistryMarks);
        sanskrit = findViewById(R.id.sanskritMarks);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(Biology.this, BiologyPractical.class);
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biology.setText("");
                english.setText("");
                physics.setText("");
                chemistry.setText("");
                sanskrit.setText("");
            }
        });
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(english.getText().toString())) {
            Toast.makeText(this, "Please enter English marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(biology.getText().toString())) {
            Toast.makeText(this, "Please enter Biology marks", Toast.LENGTH_SHORT).show();
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
        if (TextUtils.isEmpty(sanskrit.getText().toString())) {
            Toast.makeText(this, "Please enter Sanskrit marks", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }

}