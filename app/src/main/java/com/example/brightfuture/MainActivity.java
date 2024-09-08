package com.example.brightfuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.X.XActivity;
import com.example.brightfuture.XII.XIIActivity;
import com.example.brightfuture.auth.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button xButton = findViewById(R.id.X_button);
        Button xiiButton = findViewById(R.id.XII_button);

        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, XActivity.class);
                startActivity(intent);
            }
        });

        xiiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, XIIActivity.class);
                startActivity(intent);
            }
        });
    }
}
