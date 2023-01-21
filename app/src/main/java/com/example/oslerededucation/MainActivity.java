package com.example.oslerededucation;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

       if (savedInstanceState == null) {

             navigationView.setCheckedItem(R.id.nav_rotation_contacts);

       }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.nav_rotation_contacts:
                Intent intent = new Intent(getApplicationContext(), RotationContacts.class);
                startActivity(intent);

                break;
            case R.id.nav_eGH_contacts:
                Intent intent1 = new Intent(MainActivity.this, EGHContacts.class);
                startActivity(intent1);

                break;
            case R.id.nav_bCH_contacts:
                Intent intent2 = new Intent(MainActivity.this, BCHContacts.class);
                startActivity(intent2);

                break;
            case R.id.nav_department_map:
                Intent intent3 = new Intent(MainActivity.this, DepartmentMap.class);
                startActivity(intent3);

                break;
            case R.id.nav_bchDepartmentMap:
                Intent intent4 = new Intent(MainActivity.this, BchDepartmentMap.class);
                startActivity(intent4);

                break;
            case R.id.nav_parkingBadgeITCredentials:
                Intent intent5 = new Intent(MainActivity.this, ParkingBadgeITCredentials.class);
                startActivity(intent5);

                break;
            case R.id.nav_covid19_screening:
                Intent intent6 = new Intent(MainActivity.this, COVID19Screening.class);
                startActivity(intent6);
                break;
            case R.id.nav_educational_resources:
                Intent intent7 = new Intent(MainActivity.this, EducationalResources.class);
                startActivity(intent7);

                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START))
         {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
}