package com.example.brightfuture.X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.InputFilter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;

public class XmarksActivity extends BaseActivity {

    private EditText maths, english, science, socialScience, hindi_sanskrit, gujarati;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);

        setChildLayout(R.layout.activity_x_marks);

        maths = findViewById(R.id.mathMarks);
        english = findViewById(R.id.englishMarks);
        science = findViewById(R.id.scienceMarks);
        socialScience = findViewById(R.id.socialScienceMarks);
        hindi_sanskrit = findViewById(R.id.hindiSanskritMarks);
        gujarati = findViewById(R.id.gujaratiMarks);

        InputFilter[] filters = new InputFilter[]{new InputFilter.LengthFilter(2)};
        maths.setFilters(filters);
        english.setFilters(filters);
        science.setFilters(filters);
        socialScience.setFilters(filters);
        hindi_sanskrit.setFilters(filters);
        gujarati.setFilters(filters);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(XmarksActivity.this, DocumentUpload.class);
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maths.setText("");
                english.setText("");
                science.setText("");
                socialScience.setText("");
                hindi_sanskrit.setText("");
                gujarati.setText("");
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
        if (TextUtils.isEmpty(science.getText().toString())) {
            Toast.makeText(this, "Please enter Science marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(socialScience.getText().toString())) {
            Toast.makeText(this, "Please enter Social Science marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(hindi_sanskrit.getText().toString())) {
            Toast.makeText(this, "Please enter Hindi/Sanskrit marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(gujarati.getText().toString())) {
            Toast.makeText(this, "Please enter Gujarati marks", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }

}
