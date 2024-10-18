package com.example.brightfuture.XII;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.ExtraCourse;
import com.example.brightfuture.R;
import com.example.brightfuture.XII.arts.ArtsSubject11;
import com.example.brightfuture.XII.arts.ArtsSubject12;
import com.example.brightfuture.XII.commerce.CommerceSubject11;
import com.example.brightfuture.XII.commerce.CommerceSubject12;
import com.example.brightfuture.XII.science.ScienceSubject11;
import com.example.brightfuture.XII.science.ScienceSubject12;

public class RegardingSubject extends BaseActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.regarding_subject);

        Intent intent = getIntent();
        String source = intent.getStringExtra("source");

        Toast.makeText(this, source, Toast.LENGTH_SHORT).show();

        Button buttonSubject = findViewById(R.id.regardingSubject);

        buttonSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(source.equals("Science12")){
                    Intent intent = new Intent(RegardingSubject.this, ScienceSubject12.class);
                    startActivity(intent);
                }
                else if(source.equals("Science11")){
                    Intent intent = new Intent(RegardingSubject.this, ScienceSubject11.class);
                    startActivity(intent);
                }
                else if(source.equals("Commerce12")){
                    Intent intent = new Intent(RegardingSubject.this, CommerceSubject12.class);
                    startActivity(intent);
                }
                else if(source.equals("Commerce11")){
                    Intent intent = new Intent(RegardingSubject.this, CommerceSubject11.class);
                    startActivity(intent);
                }
                else if(source.equals("Arts12")){
                    Intent intent = new Intent(RegardingSubject.this, ArtsSubject12.class);
                    startActivity(intent);
                }
                else if(source.equals("Arts11")){
                    Intent intent = new Intent(RegardingSubject.this, ArtsSubject11.class);
                    startActivity(intent);
                }
            }
        });


        Button buttonExtraCourse = findViewById(R.id.extraCourse);

        buttonExtraCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegardingSubject.this, ExtraCourse.class);
                startActivity(intent);
            }
        });
    }
}
