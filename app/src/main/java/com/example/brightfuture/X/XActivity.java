package com.example.brightfuture.X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;
import com.example.brightfuture.XII.XIICourse;
import com.example.brightfuture.XII.arts.ArtsActivity;
import com.example.brightfuture.XII.commerce.CommerceActivity;
import com.example.brightfuture.XII.science.ScienceActivity;

//
//public class XActivity extends BaseActivity {
//
//    private EditText name, mobileNo, whatsApp;
//    private Button reset, next;
//
//    private Spinner hobbySpinner;
//    private String selectedHobby, hobby;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Use the child layout method to set XActivity's layout inside the BaseActivity layout
//        setChildLayout(R.layout.activity_x);
//
//        // Initialize EditText fields
//        name = findViewById(R.id.name);
//        mobileNo = findViewById(R.id.mobileNo);
//        whatsApp = findViewById(R.id.whatsAppNo);
////        hobby = findViewById(R.id.hobby);
//
//        // Initialize Buttons with correct IDs
//        next = findViewById(R.id.buttonNext);
//        reset = findViewById(R.id.buttonReset);
//
//        hobbySpinner = findViewById(R.id.hobbySpinner);
//
//        hobbySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                selectedHobby = parent.getItemAtPosition(position).toString();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                selectedHobby = null;
//            }
//        });
//
//        if(selectedHobby != null && !selectedHobby.equals("Enter your Interest")){
//            Toast.makeText(XActivity.this, "Selected Hobby: "+selectedHobby, Toast.LENGTH_SHORT).show();
//
//            if(selectedHobby.equals("Science")){
//                hobby = "Science";
//            } else if (selectedHobby.equals("Commerce")) {
//                hobby = "Commerce";
//            }
//            else{
//                hobby = "Arts";
//            }
//        }
//
////        next.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                if (validateFields()) {
////                    // Save data to SharedPreferences
////                    SharedPreferences sharedPreferences = getSharedPreferences("UserProfile", MODE_PRIVATE);
////                    SharedPreferences.Editor editor = sharedPreferences.edit();
////                    editor.putString("name", name.getText().toString());
////                    editor.putString("mobileNo", mobileNo.getText().toString());
////                    editor.putString("whatsApp", whatsApp.getText().toString());
////                    editor.putString("hobby", hobby.getText().toString());
////                    editor.apply();
////
////                    // Navigate to the next activity
////                    Intent intent = new Intent(XActivity.this, XmarksActivity.class);
////                    startActivity(intent);
////                }
////            }
////        });
//
//
////        Adding Spinner in Area of Interest
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (validateFields()) {
//                    // Save data to SharedPreferences
//                    SharedPreferences sharedPreferences = getSharedPreferences("UserProfile", MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPreferences.edit();
//                    editor.putString("name", name.getText().toString());
//                    editor.putString("mobileNo", mobileNo.getText().toString());
//                    editor.putString("whatsApp", whatsApp.getText().toString());
//                    editor.putString("hobby", hobby);  // save hobby text
//                    editor.putString("selectedHobby", selectedHobby);  // save selected hobby from spinner
//                    editor.apply();
//
//                    // Navigate to the next activity
//                    Intent intent = new Intent(XActivity.this, XmarksActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });
//
//
//
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                name.setText("");
//                mobileNo.setText("");
//                whatsApp.setText("");
////                hobby.setText("");
//                hobbySpinner.setSelection(0);
//            }
//        });
//    }
//
//    private boolean validateFields() {
//        if (TextUtils.isEmpty(name.getText().toString())) {
//            Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (TextUtils.isEmpty(mobileNo.getText().toString())) {
//            Toast.makeText(this, "Please enter Mobile No.", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (mobileNo.getText().toString().length() < 10 || mobileNo.getText().toString().length() > 10) {
//            Toast.makeText(this, "Please enter 10 digit Mobile No.", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (TextUtils.isEmpty(whatsApp.getText().toString())) {
//            Toast.makeText(this, "Please enter WhatsApp No.", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (whatsApp.getText().toString().length() < 10 || whatsApp.getText().toString().length() > 10) {
//            Toast.makeText(this, "Please enter 10 digit WhatsApp No.", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (selectedHobby == null || selectedHobby.equals("Enter your Interest")) {
//            Toast.makeText(this, "Please select a valid Hobby", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//
//        return true;
//    }
//}


public class XActivity extends BaseActivity {

    private EditText name, mobileNo, whatsApp;
    private Button reset, next;

    private Spinner hobbySpinner;
    private String selectedHobby, hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Use the child layout method to set XActivity's layout inside the BaseActivity layout
        setChildLayout(R.layout.activity_x);

        // Initialize EditText fields
        name = findViewById(R.id.name);
        mobileNo = findViewById(R.id.mobileNo);
        whatsApp = findViewById(R.id.whatsAppNo);

        // Initialize Buttons with correct IDs
        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        // Initialize the spinner
        hobbySpinner = findViewById(R.id.hobbySpinner);

        // Set the onItemSelectedListener for the spinner
        hobbySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedHobby = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedHobby = null;
            }
        });


            System.out.println("selectedHobby --------------- "+selectedHobby);


        // Set up the 'Next' button click listener with validation
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected hobby from the spinner at the time of button click
                selectedHobby = hobbySpinner.getSelectedItem().toString();

                // Validate the fields
                if (validateFields()) {
                    // Assign hobby based on selected option
                    if (selectedHobby.equals("Science")) {
                        hobby = "Science";
                    } else if (selectedHobby.equals("Commerce")) {
                        hobby = "Commerce";
                    } else if (selectedHobby.equals("Arts")) {
                        hobby = "Arts";
                    } else {
                        hobby = null;  // Reset if invalid selection
                    }

                    // Save the input data to SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("UserProfile", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("name", name.getText().toString());
                    editor.putString("mobileNo", mobileNo.getText().toString());
                    editor.putString("whatsApp", whatsApp.getText().toString());
                    editor.putString("hobby", hobby);  // Save hobby based on spinner choice
                    editor.putString("selectedHobby", selectedHobby);  // Save selected hobby from spinner
                    editor.apply();

                    // Navigate to the next activity (XmarksActivity)
                    Intent intent = new Intent(XActivity.this, XmarksActivity.class);
                    startActivity(intent);
                }
            }
        });



        // Set up the 'Reset' button to clear inputs
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                mobileNo.setText("");
                whatsApp.setText("");
                hobbySpinner.setSelection(0);  // Reset spinner to default
            }
        });
    }

    // Validation function to check user input
    private boolean validateFields() {
        if (TextUtils.isEmpty(name.getText().toString())) {
            Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(mobileNo.getText().toString())) {
            Toast.makeText(this, "Please enter Mobile No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (mobileNo.getText().toString().length() != 10) {
            Toast.makeText(this, "Please enter a 10 digit Mobile No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(whatsApp.getText().toString())) {
            Toast.makeText(this, "Please enter WhatsApp No.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (whatsApp.getText().toString().length() != 10) {
            Toast.makeText(this, "Please enter a 10 digit WhatsApp No.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validate the hobby from the spinner
        if (selectedHobby == null || selectedHobby.equals("Enter your Interest")) {
            System.out.println("I passed ===================================== ");
            Toast.makeText(this, "Please select a valid Hobby", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;  // All validations passed
    }

}
