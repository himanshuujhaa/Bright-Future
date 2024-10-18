package com.example.brightfuture.XII.arts;

import android.os.Bundle;
import android.widget.Toast;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;

public class ArtsSubject12 extends BaseActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_arts_subject11);

        Toast.makeText(this, "Arts 12", Toast.LENGTH_SHORT).show();
    }
}
