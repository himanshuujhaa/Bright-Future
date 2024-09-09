package com.example.brightfuture.X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;

public class XActivity extends AppCompatActivity {

    private EditText name, mobileNo, whatsApp, hobby;
    private Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x);

        // Initialize EditText fields
        name = findViewById(R.id.name);
        mobileNo = findViewById(R.id.mobileNo);
        whatsApp = findViewById(R.id.whatsAppNo);
        hobby = findViewById(R.id.hobby);

        // Initialize Buttons with correct IDs
        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validateFields()) {
                    Intent intent = new Intent(XActivity.this, XmarksActivity.class);
                    startActivity(intent);
                }
            }
        });

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
        if (TextUtils.isEmpty(whatsApp.getText().toString())) {
            Toast.makeText(this, "Please enter WhatsApp No.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // If all fields are filled, return true
        return true;
    }
}
