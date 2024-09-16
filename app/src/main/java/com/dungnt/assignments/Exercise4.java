package com.dungnt.assignments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dungnt.assignments.exercise4.CalculatorBmi;
import com.dungnt.assignments.exercise4.ConvertTemporary;

public class Exercise4 extends AppCompatActivity {
    Button btnCalculatorBmi;
    Button btnConvertTemporary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise4);

        btnCalculatorBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Exercise4.this, CalculatorBmi.class);
                startActivity(inten);
            }
        });

        btnConvertTemporary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Exercise4.this, ConvertTemporary.class);
                startActivity(inten);

            }
        });
    }
}