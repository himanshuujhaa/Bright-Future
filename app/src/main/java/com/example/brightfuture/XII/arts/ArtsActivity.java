package com.example.brightfuture.XII.arts;

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
import com.example.brightfuture.XII.commerce.CommerceActivity;

public class ArtsActivity extends AppCompatActivity {

    private EditText english, ba, sociology, philosophy, geography, sanskrit, gujarati;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_arts);

        english = findViewById(R.id.englishMarks);
        ba = findViewById(R.id.baMarks);
        sociology = findViewById(R.id.sociologyMarks);
        philosophy = findViewById(R.id.philosophyMarks);
        geography = findViewById(R.id.geographyMarks);
        sanskrit = findViewById(R.id.sanskritMarks);
        gujarati = findViewById(R.id.gujaratiMarks);


        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    // All fields are filled, proceed to next activity
                    Intent intent = new Intent(ArtsActivity.this, XIIDocumentUpload.class);
                    intent.putExtra("source", "arts");
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                english.setText("");
                ba.setText("");
                sociology.setText("");
                philosophy.setText("");
                sanskrit.setText("");
                geography.setText("");
                gujarati.setText("");
            }
        });
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(english.getText().toString())) {
            Toast.makeText(this, "Please enter English marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ba.getText().toString())) {
            Toast.makeText(this, "Please enter BA marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(sociology.getText().toString())) {
            Toast.makeText(this, "Please enter Sociology marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(philosophy.getText().toString())) {
            Toast.makeText(this, "Please enter Philosophy marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(sanskrit.getText().toString())) {
            Toast.makeText(this, "Please enter Sanskrit marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(geography.getText().toString())) {
            Toast.makeText(this, "Please enter Geography marks", Toast.LENGTH_SHORT).show();
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
