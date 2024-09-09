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

import com.example.brightfuture.R;
import com.example.brightfuture.XII.XIIDocumentUpload;

public class DocumentUpload extends AppCompatActivity {

    private static final int REQUEST_CODE_PICK_FILE_X = 1;
    private static final int REQUEST_CODE_PICK_FILE_IX = 2;
    private Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_upload);

        // Initialize buttons
        Button uploadXII = findViewById(R.id.uploadMarksheetX);
        Button uploadXI = findViewById(R.id.uploadMarksheetIX);
        reset = findViewById(R.id.buttonReset); // Ensure this ID exists in activity_document_upload.xml
        next = findViewById(R.id.buttonNext); // Ensure this ID exists in activity_document_upload.xml

        // Set click listener for Marksheet XII upload
        uploadXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_X);
            }
        });

        // Set click listener for Marksheet XI upload
        uploadXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker(REQUEST_CODE_PICK_FILE_IX);
            }
        });

        // Set click listener for reset button
//        if (reset != null) {
//            reset.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // Reset selected file names
//                    selectedXFileName = null;
//                    selectedIXFileName = null;
//
//                    // Reset any UI elements if needed (e.g., Toast message)
//                    Toast.makeText(DocumentUpload.this, "Selections have been reset", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }

        // Set click listener for next button
        if (next != null) {
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DocumentUpload.this, ScienceQuizActivity.class);
                    startActivity(intent);
                }
            });
        }
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
                // Handle document upload for Marksheet XII
                Toast.makeText(this, "Selected X Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
            } else if (requestCode == REQUEST_CODE_PICK_FILE_IX) {
                // Handle document upload for Marksheet XI
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
}
