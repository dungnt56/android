package com.dungnt.assignments.exercise7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dungnt.assignments.R;

import java.text.DecimalFormat;

public class UseIntenFilter extends AppCompatActivity {

    TextView resultText;
    Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_use_inten_filter);

        resultText = findViewById(R.id.textViewResult);
        btnBack = findViewById(R.id.btnBack);

        Intent currentIntent = getIntent();
        Bundle body = currentIntent.getBundleExtra("body");
        int a = body.getInt("aValue");
        int b = body.getInt("bValue");
        String result = "";
        if (a ==0 && b == 0){
            result = "vo so nghiem";
        } else if (a == 0 && b != 0) {
            result = "Vo nghiem";
        } else {
            DecimalFormat dcf = new DecimalFormat(("0.##"));
            result = dcf.format(-b * 1.0/a);
        }

        resultText.setText("Ket qua ne: " + result);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}