package com.dungnt.assignments;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercise3 extends AppCompatActivity {
    Button btnPlus, btnDivide, btnSub, btnMulti;
    EditText inputA, inputB, resultEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        inputA = findViewById(R.id.edta);
        inputB = findViewById(R.id.edtb);
        resultEditText = findViewById(R.id.edtc);

    }
}