package com.dungnt.assignments.constant;

import java.util.HashMap;
import java.util.Map;

public final class Constant {
    public static final Map<Integer, String> MAP_CAN;

    static {
        MAP_CAN = new HashMap<>();
        MAP_CAN.put(0, "Canh");
        MAP_CAN.put(1, "Tân");
        MAP_CAN.put(2, "Nhâm");
        MAP_CAN.put(3, "Quý");
        MAP_CAN.put(4, "Giáp");
        MAP_CAN.put(5, "Ất");
        MAP_CAN.put(6, "Bính");
        MAP_CAN.put(7, "Đinh");
        MAP_CAN.put(8, "Mậu");
        MAP_CAN.put(9, "Kỷ");
    }

    public static final Map<Integer, String> MAP_CHI;
    static {
        MAP_CHI = new HashMap<>();
        MAP_CHI.put(0, "Thân");
        MAP_CHI.put(1, "Dậu");
        MAP_CHI.put(2, "Tuất");
        MAP_CHI.put(3, "Hợi");
        MAP_CHI.put(4, "Tý");
        MAP_CHI.put(5, "Sửu");
        MAP_CHI.put(6, "Dần");
        MAP_CHI.put(7, "Mẹo");
        MAP_CHI.put(8, "Thìn");
        MAP_CHI.put(9, "Tỵ");
        MAP_CHI.put(10, "Ngọ");
        MAP_CHI.put(11, "Mùi");
    }
}
