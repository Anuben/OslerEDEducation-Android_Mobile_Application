package com.example.oslerededucation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DepartmentMap extends AppCompatActivity {
    View view;
    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_map);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        firstFragment = (Button) findViewById(R.id.firstFragment);

        secondFragment = (Button) findViewById(R.id.secondFragment);


        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DepartmentMap.this, FirstMap.class);
                startActivity(intent);
            }

        });

        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DepartmentMap.this, SecondMap.class);
                startActivity(intent);
            }

        });
    }
}