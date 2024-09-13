package com.example.brightfuture.XII.commerce;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;
import com.example.brightfuture.XII.XIIDocumentUpload;
import com.example.brightfuture.XII.science.mathsbio.MathsBiologyPractical;

public class CommerceActivity extends AppCompatActivity {

    private EditText english, ba, eco, state, account, spcc, gujarati;
    private Button next, reset;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_commerce);

        english = findViewById(R.id.englishMarks);
        ba = findViewById(R.id.baMarks);
        eco = findViewById(R.id.ecoMarks);
        state = findViewById(R.id.stateMarks);
        account = findViewById(R.id.accountMarks);
        spcc = findViewById(R.id.spccMarks);
        gujarati = findViewById(R.id.gujaratiMarks);

        InputFilter[] filters = new InputFilter[]{new InputFilter.LengthFilter(2)};
        ba.setFilters(filters);
        english.setFilters(filters);
        eco.setFilters(filters);
        state.setFilters(filters);
        account.setFilters(filters);
        gujarati.setFilters(filters);
        spcc.setFilters(filters);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(CommerceActivity.this, XIIDocumentUpload.class);
                    intent.putExtra("source", "commerce");
                    startActivity(intent);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                english.setText("");
                ba.setText("");
                eco.setText("");
                state.setText("");
                account.setText("");
                spcc.setText("");
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
        if (TextUtils.isEmpty(eco.getText().toString())) {
            Toast.makeText(this, "Please enter ECO marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(state.getText().toString())) {
            Toast.makeText(this, "Please enter State marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(account.getText().toString())) {
            Toast.makeText(this, "Please enter Account marks", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(spcc.getText().toString())) {
            Toast.makeText(this, "Please enter SPCC marks", Toast.LENGTH_SHORT).show();
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
