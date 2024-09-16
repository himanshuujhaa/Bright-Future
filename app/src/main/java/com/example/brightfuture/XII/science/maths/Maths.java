package com.example.brightfuture.XII.science.maths;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;
import com.example.brightfuture.X.DocumentUpload;
import com.example.brightfuture.X.XmarksActivity;

public class Maths extends BaseActivity {

    private EditText maths, english, physics, chemistry, computer;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_science_maths);

        maths = findViewById(R.id.mathMarks);
        english = findViewById(R.id.englishMarks);
        physics = findViewById(R.id.physicsMarks);
        chemistry = findViewById(R.id.chemistryMarks);
        computer = findViewById(R.id.computerMarks);

        InputFilter[] filters = new InputFilter[]{new InputFilter.LengthFilter(2)};
        maths.setFilters(filters);
        physics.setFilters(filters);
        chemistry.setFilters(filters);
        english.setFilters(filters);
        computer.setFilters(filters);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(Maths.this, MathsPractical.class);
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maths.setText("");
                english.setText("");
                physics.setText("");
                chemistry.setText("");
                computer.setText("");
            }
        });
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(english.getText().toString())) {
            Toast.makeText(this, "Please enter English marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(maths.getText().toString())) {
            Toast.makeText(this, "Please enter Maths marks", Toast.LENGTH_SHORT).show();
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
        if (TextUtils.isEmpty(computer.getText().toString())) {
            Toast.makeText(this, "Please enter Computer marks", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }
}