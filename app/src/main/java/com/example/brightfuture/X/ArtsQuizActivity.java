package com.example.brightfuture.X;

import android.os.Bundle;
import android.widget.Toast;

import com.example.brightfuture.BaseActivity;

public class ArtsQuizActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Arts Quiz", Toast.LENGTH_SHORT).show();
    }
}
