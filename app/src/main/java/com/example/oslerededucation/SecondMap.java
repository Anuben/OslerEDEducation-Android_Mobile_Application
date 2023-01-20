package com.example.oslerededucation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondMap extends AppCompatActivity {
        View view;
        Button backtButton2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second_map);

            backtButton2 = (Button)findViewById(R.id.backtButton2);

            backtButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.oslerededucation.SecondMap.this, DepartmentMap.class);
                    startActivity(intent);
                }
            });
        }
 }
