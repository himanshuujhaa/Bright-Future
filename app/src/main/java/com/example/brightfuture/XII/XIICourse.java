package com.example.brightfuture.XII;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;
import com.example.brightfuture.XII.arts.ArtsActivity;
import com.example.brightfuture.XII.commerce.CommerceActivity;
import com.example.brightfuture.XII.science.ScienceActivity;

public class XIICourse extends AppCompatActivity {

    private Spinner streamSpinner;
    private Button reset, next;
    private String selectedStream;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_course);

        streamSpinner = findViewById(R.id.streamSpinner);
        reset = findViewById(R.id.buttonReset);
        next = findViewById(R.id.buttonNext);

        streamSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedStream = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedStream = null;
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                streamSpinner.setSelection(0);
                Toast.makeText(XIICourse.this, "Selection Reset", Toast.LENGTH_SHORT).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedStream != null && !selectedStream.equals("Select Your Course")){
                    Toast.makeText(XIICourse.this, "Selected Stream: "+selectedStream, Toast.LENGTH_SHORT).show();

                    if(selectedStream.equals("Science")){
                        Intent intent = new Intent(XIICourse.this, ScienceActivity.class);
                        intent.putExtra("Selected Stream", selectedStream);
                        startActivity(intent);
                    } else if (selectedStream.equals("Commerce")) {
                        Intent intent = new Intent(XIICourse.this, CommerceActivity.class);
                        intent.putExtra("Selected Stream", selectedStream);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(XIICourse.this, ArtsActivity.class);
                        intent.putExtra("Selected Stream", selectedStream);
                        startActivity(intent);
                    }
                }
                else{
                    Toast.makeText(XIICourse.this, "Please select a valid Course", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
