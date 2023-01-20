package com.example.oslerededucation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstMap extends AppCompatActivity {
    View view;
    Button backButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_map);

        backButton1 = (Button) findViewById(R.id.backtButton1);

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstMap.this, DepartmentMap.class);
                startActivity(intent);
            }
        });
}
}