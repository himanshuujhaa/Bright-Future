package com.example.brightfuture.X;

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
import com.example.brightfuture.XII.XIIDocumentUpload;

public class DocumentUpload extends BaseActivity {

    private static final int REQUEST_CODE_PICK_FILE_X = 1;
    private static final int REQUEST_CODE_PICK_FILE_IX = 2;

    private Button reset, next;
    private Uri selectedFileUriX = null;  // To keep track of selected X marksheet
    private Uri selectedFileUriIX = null; // To keep track of selected IX marksheet

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setChildLayout(R.layout.activity_document_upload);

        // Initialize buttons
        Button uploadX = findViewById(R.id.uploadMarksheetX);
        Button uploadIX = findViewById(R.id.uploadMarksheetIX);
        reset = findViewById(R.id.buttonReset);  // Ensure this ID exists in activity_document_upload.xml
        next = findViewById(R.id.buttonNext);    // Ensure this ID exists in activity_document_upload.xml

        // Set click listener for Marksheet X upload
        uploadX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_X);
            }
        });

        // Set click listener for Marksheet IX upload
        uploadIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_IX);
            }
        });

        // Set click listener for reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSelectedFiles();  // Reset the selected files
            }
        });

        // Set click listener for next button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DocumentUpload.this, ScienceQuizActivity.class);
                startActivity(intent);
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
            if (requestCode == REQUEST_CODE_PICK_FILE_X) {
                selectedFileUriX = fileUri;  // Store the selected file URI for X
                Toast.makeText(this, "Selected X Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
            } else if (requestCode == REQUEST_CODE_PICK_FILE_IX) {
                selectedFileUriIX = fileUri; // Store the selected file URI for IX
                Toast.makeText(this, "Selected IX Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
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
        // Clear the stored URIs for both X and IX marksheets
        selectedFileUriX = null;
        selectedFileUriIX = null;

        // Provide feedback to the user that the documents have been reset
        Toast.makeText(this, "Selections have been reset", Toast.LENGTH_SHORT).show();
    }
}
