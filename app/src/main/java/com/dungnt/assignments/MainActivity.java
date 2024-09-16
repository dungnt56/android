package com.dungnt.assignments;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.dungnt.assignments.exercise4.Exercise4;
import com.dungnt.assignments.exercise5.Exercise5;
import com.google.android.material.navigation.NavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.exercise3) {
                    Intent intent = new Intent(MainActivity.this, Exercise3.class);
                    startActivity(intent);
                } else if (id == R.id.exercise4) {
                    Intent intent = new Intent(MainActivity.this, Exercise4.class);
                    startActivity(intent);
                } else if (id == R.id.exercise5) {
                    Intent intent = new Intent(MainActivity.this, Exercise5.class);
                    startActivity(intent);
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }
}
