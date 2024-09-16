package com.dungnt.assignments.exercise7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dungnt.assignments.Exercise3;
import com.dungnt.assignments.R;

public class Exercise7 extends AppCompatActivity {
    Button resultBtn;
    EditText inputA, inputB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise7);

        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        resultBtn = findViewById(R.id.btnResult);
        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise7.this, UseIntenFilter.class);
                Bundle myBundle = new Bundle();
                myBundle.putInt("aValue", Integer.parseInt(inputA.getText().toString()));
                myBundle.putInt("bValue", Integer.parseInt(inputB.getText().toString()));

                intent.putExtra("body", myBundle);


                startActivity(intent);
            }
        });
    }
}