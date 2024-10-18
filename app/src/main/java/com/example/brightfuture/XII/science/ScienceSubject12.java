package com.example.brightfuture.XII.science;

import android.os.Bundle;
import android.widget.Toast;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;

public class ScienceSubject12 extends BaseActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_science_subject12);

        Toast.makeText(this, "Science 12", Toast.LENGTH_SHORT).show();
    }
}
