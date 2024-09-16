package com.example.brightfuture.XII.science;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;
import com.example.brightfuture.XII.science.biology.Biology;
import com.example.brightfuture.XII.science.maths.Maths;
import com.example.brightfuture.XII.science.mathsbio.MathsBio;

public class ScienceActivity extends BaseActivity {

    private Spinner subjectSpinner;
    private Button reset, next;
    private String selectedSubject;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setChildLayout(R.layout.activity_science);

        subjectSpinner = findViewById(R.id.subjectSpinner);
        reset = findViewById(R.id.buttonReset);
        next = findViewById(R.id.buttonNext);

        subjectSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSubject = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedSubject = null;
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                subjectSpinner.setSelection(0);
                Toast.makeText(ScienceActivity.this, "Selection Reset", Toast.LENGTH_SHORT).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(selectedSubject != null && !selectedSubject.equals("Select Your Subject")){
                    Toast.makeText(ScienceActivity.this, "Selected Subject: "+selectedSubject, Toast.LENGTH_SHORT).show();

                    if(selectedSubject.equals("Maths")){
                        Intent intent = new Intent(ScienceActivity.this, Maths.class);
                        intent.putExtra("Selected Subject", selectedSubject);
                        startActivity(intent);
                    }
                    else if(selectedSubject.equals("Biology")){
                        Intent intent = new Intent(ScienceActivity.this, Biology.class);
                        intent.putExtra("Selected Subject", selectedSubject);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(ScienceActivity.this, MathsBio.class);
                        intent.putExtra("Selected Subject", selectedSubject);
                        startActivity(intent);
                    }
                }
                else{
                    Toast.makeText(ScienceActivity.this, "Please Select a Valid Subject", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
