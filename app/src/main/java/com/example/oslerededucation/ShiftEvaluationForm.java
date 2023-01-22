package com.example.oslerededucation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ShiftEvaluationForm extends AppCompatActivity {
    Button openPdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_evaluation_form);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        openPdf = (Button) findViewById(R.id.openPdf);

        openPdf.setOnClickListener(new View.OnClickListener() {

            @Override
           public void onClick(View v) {

                Uri uri = Uri.parse("https://drive.google.com/file/d/1uQdXAiX95IsM_vf8XPQ6lxquaXC_6BzE/view?usp=sharing");
               Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
           }

        });
    }
}