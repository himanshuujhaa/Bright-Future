package com.example.brightfuture.XII;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;

public class XIIActivity extends AppCompatActivity {

    private EditText name, mobileNo, whatsApp, hobby;
    private Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xii);

        // Initialize EditText fields
        name = findViewById(R.id.name);
        mobileNo = findViewById(R.id.mobileNo);
        whatsApp = findViewById(R.id.whatsAppNo);
        hobby = findViewById(R.id.hobby);

        String nameStr = name.getText().toString();
        String mobileNoStr = mobileNo.getText().toString();
        String whatsAppStr = whatsApp.getText().toString();
        String hobbyStr = hobby.getText().toString();

        // Initialize Buttons
        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        // Set OnClickListener for the next button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(XIIActivity.this, XIICourse.class);
                    startActivity(intent);
                }
            }
        });

        // Set OnClickListener for the reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                mobileNo.setText("");
                whatsApp.setText("");
                hobby.setText("");
            }
        });
    }

    private boolean validateFields() {
        if (TextUtils.isEmpty(name.getText().toString())) {
            Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(mobileNo.getText().toString())) {
            Toast.makeText(this, "Please enter Mobile No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(mobileNo.getText().toString().length() < 10 || mobileNo.getText().toString().length() > 10){
            Toast.makeText(this, "Please enter 10 digit Mobile No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(whatsApp.getText().toString())) {
            Toast.makeText(this, "Please enter WhatsApp No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(whatsApp.getText().toString().length() < 10 || whatsApp.getText().toString().length() > 10){
            Toast.makeText(this, "Please enter 10 digit WhatsApp No.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }
}
