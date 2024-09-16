package com.dungnt.assignments.exercise4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.dungnt.assignments.R;

public class Exercise4 extends AppCompatActivity {

    Button btnCalculatorBmi;
    Button btnConvertTemporary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise4);


        btnCalculatorBmi = findViewById(R.id.btnCalculatorBMI);
        btnConvertTemporary = findViewById(R.id.btnConvertTemporary);

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