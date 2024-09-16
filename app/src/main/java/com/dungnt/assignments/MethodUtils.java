package com.dungnt.assignments;

import android.text.TextUtils;

import java.util.Calendar;

public class MethodUtils {
    public static Boolean isValidNumber(String value){

        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

/*
    * Description: check valid year number
    * Condition:
        - only has number character
        - Number of character is 4
        - Bigger than 0 and smaller or equal 9999
*/
 public static boolean isValidYear(String year) {
        if (year == null || year.length() != 4 || !year.matches("\\d+")) {
            return false;
        }
        int yearValue = Integer.parseInt(year);
        return yearValue > 0 && yearValue <= 9999;
    }
}
