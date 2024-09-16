package com.dungnt.assignments.exercise5;

import static com.dungnt.assignments.MethodUtils.isValidYear;
import static com.dungnt.assignments.constant.Constant.MAP_CAN;
import static com.dungnt.assignments.constant.Constant.MAP_CHI;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dungnt.assignments.R;


public class ConvertYearToChinaYear extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_convert_year_to_china_year);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private String convertYearNumberToChinaYear(String yearNumber){
        if (!isValidYear(yearNumber)){
            return "Nam khong hop le";
        }
        Integer yearValue = Integer.parseInt(yearNumber);
        String can = MAP_CAN.get(yearValue % 10);
        String am = MAP_CHI.get(yearValue % 12);
        return can + " " + am;
    }
}