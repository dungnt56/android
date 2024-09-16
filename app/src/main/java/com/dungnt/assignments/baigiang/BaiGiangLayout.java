package com.dungnt.assignments.baigiang;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dungnt.assignments.R;

public class BaiGiangLayout extends AppCompatActivity {

    TextView signUp;
    Button btnSignIn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_giang_layout);
        signUp = findViewById(R.id.signUpBtn);
        btnSignIn = findViewById(R.id.btnSignIn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BaiGiangLayout.this, "abc", Toast.LENGTH_SHORT).show();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentHomePage = new Intent(BaiGiangLayout.this, BaiGiangLayoutHomPage.class);
                startActivity(intentHomePage);
                Toast.makeText(BaiGiangLayout.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
            }

        });
    }
}