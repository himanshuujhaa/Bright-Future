package com.example.brightfuture.XII.science.mathsbio;

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
import com.example.brightfuture.XII.science.biology.Biology;
import com.example.brightfuture.XII.science.biology.BiologyPractical;

public class MathsBio extends BaseActivity {

    private EditText biology, english, physics, chemistry, maths;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_science_maths_bio);

        biology = findViewById(R.id.biologyMarks);
        english = findViewById(R.id.englishMarks);
        physics = findViewById(R.id.physicsMarks);
        chemistry = findViewById(R.id.chemistryMarks);
        maths = findViewById(R.id.mathMarks);

        InputFilter[] filters = new InputFilter[]{new InputFilter.LengthFilter(2)};
        biology.setFilters(filters);
        physics.setFilters(filters);
        chemistry.setFilters(filters);
        english.setFilters(filters);
        maths.setFilters(filters);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(MathsBio.this, MathsBiologyPractical.class);
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
                maths.setText("");
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
        if (TextUtils.isEmpty(maths.getText().toString())) {
            Toast.makeText(this, "Please enter Maths marks", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }
}



