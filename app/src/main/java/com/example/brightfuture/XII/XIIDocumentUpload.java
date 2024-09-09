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

import com.example.brightfuture.R;

public class XIIDocumentUpload extends AppCompatActivity {

    private static final int REQUEST_CODE_PICK_FILE_XII = 1;
    private static final int REQUEST_CODE_PICK_FILE_XI = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xii_document_upload);

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
                // Handle document upload for Marksheet XII
                Toast.makeText(this, "Selected XII Marksheet: " + fileName, Toast.LENGTH_SHORT).show();
            } else if (requestCode == REQUEST_CODE_PICK_FILE_XI) {
                // Handle document upload for Marksheet XI
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
}
