package com.dungnt.assignments;

import android.text.TextUtils;

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
}
