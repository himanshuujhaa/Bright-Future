package com.example.brightfuture.XII;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.BaseActivity;
import com.example.brightfuture.R;
import com.example.brightfuture.XII.arts.ArtsQuizActivity;
import com.example.brightfuture.XII.commerce.CommerceQuizActivity;
import com.example.brightfuture.XII.science.biology.BiologyQuizActivity;
import com.example.brightfuture.XII.science.maths.MathsQuizActivity;
import com.example.brightfuture.XII.science.mathsbio.MathsBioQuizActivity;

public class XIIDocumentUpload extends BaseActivity {

    private static final int REQUEST_CODE_PICK_FILE_XII = 1;
    private static final int REQUEST_CODE_PICK_FILE_XI = 2;

    private Button next, reset;
    private Uri selectedFileUriXII = null;
    private Uri selectedFileUriXI = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setChildLayout(R.layout.activity_xii_document_upload);

        Intent intent = getIntent();
        String source = intent.getStringExtra("source");
        System.out.println("Source value " + source);

        next = findViewById(R.id.buttonNext);
        reset = findViewById(R.id.buttonReset);

        // Initialize buttons
        Button uploadXII = findViewById(R.id.uploadMarksheetXII);
        Button uploadXI = findViewById(R.id.uploadMarksheetXI);

        // Set click listener for Marksheet XII upload
        uploadXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_XII);
            }
        });

        // Set click listener for Marksheet XI upload
        uploadXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_XI);
            }
        });

        // Set click listener for the reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelectedFiles();  // Reset the selected files
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("arts".equals(source)) {
                    Intent intent = new Intent(XIIDocumentUpload.this, ArtsQuizActivity.class);
                    startActivity(intent);
                } else if ("commerce".equals(source)) {
                    Intent intent = new Intent(XIIDocumentUpload.this, CommerceQuizActivity.class);
                    startActivity(intent);
                } else if ("biology".equals(source)) {
                    Intent intent = new Intent(XIIDocumentUpload.this, BiologyQuizActivity.class);
                    startActivity(intent);
                } else if ("mathsBio".equals(source)) {
                    Intent intent = new Intent(XIIDocumentUpload.this, MathsBioQuizActivity.class);
                    startActivity(intent);
                } else if ("maths".equals(source)) {
                    Intent intent = new Intent(XIIDocumentUpload.this, MathsQuizActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    // Method to open file picker
    private void openFilePicker(int requestCode) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*"); // Allows selection of any file type
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(intent, "Select Document"), requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Uri fileUri = data.getData(); // Get the URI of the selected file
            String fileName = getFileName(fileUri); // Get file name (optional)

            if (requestCode == REQUEST_CODE_PICK_FILE_XII) {
                selectedFileUriXII = fileUri; // Store the selected file URI for XII
                Toast.makeText(this, "Selected XII Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
            } else if (requestCode == REQUEST_CODE_PICK_FILE_XI) {
                selectedFileUriXI = fileUri; // Store the selected file URI for XI
                Toast.makeText(this, "Selected XI Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
            }
        }
    }

    // Optional: Method to get file name from URI
    @SuppressLint("Range")
    private String getFileName(Uri uri) {
        String result = null;
        if (uri.getScheme().equals("content")) {
            try (Cursor cursor = getContentResolver().query(uri, null, null, null, null)) {
                if (cursor != null && cursor.moveToFirst()) {
                    result = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME));
                }
            }
        }
        if (result == null) {
            result = uri.getPath();
            int cut = result.lastIndexOf('/');
            if (cut != -1) {
                result = result.substring(cut + 1);
            }
        }
        return result;
    }

    // Method to reset selected files
    private void resetSelectedFiles() {
        // Clear the stored URIs for both XII and XI marksheets
        selectedFileUriXII = null;
        selectedFileUriXI = null;

        // Provide feedback to the user that the documents have been reset
        Toast.makeText(this, "Selected files have been reset.", Toast.LENGTH_SHORT).show();
    }
}
