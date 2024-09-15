package com.dungnt.assignments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

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

        btnDivide = findViewById(R.id.btnDivide);
        btnPlus = findViewById(R.id.btnPlus);
        btnMulti = findViewById(R.id.btnMulti);
        btnSub = findViewById(R.id.btnSub);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + inputA.getText());
                int b = Integer.parseInt("0" + inputB.getText());
                resultEditText.setText("a + b = " +(a+b));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + inputA.getText());
                int b = Integer.parseInt("0" + inputB.getText());
                resultEditText.setText("a - b = " +(a-b));

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + inputA.getText());
                int b = Integer.parseInt("0" + inputB.getText());
                DecimalFormat df = new DecimalFormat("#.##");
//                System.out.println("lam tron: " + df.format(result));
//                resultEditText.setText("a / b = " +df.format(Double.valueOf(a) /Double.valueOf(b)));
                if (b == 0){
                    inputB.setError("Không thể nhập số 0. Vui lòng nhập số khác.");
                }else {
                    resultEditText.setText("a / b = " +(Double.valueOf(a) /Double.valueOf(b)));
                }

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + inputA.getText());
                int b = Integer.parseInt("0" + inputB.getText());
                resultEditText.setText("a * b = " +(a*b));

            }
        });
    }
}