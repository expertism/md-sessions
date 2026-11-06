package org.mdigital;

import java.util.TreeMap;

public class RomanNumerals {


    public static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
    }

    public static String toNumerals(int number) {
        int value = map.floorKey(number);
        if (number == value) {
            return map.get(number);
        }
        return map.get(value) + toNumerals(number - value);
    }

    static void main() {
        System.out.println(toNumerals(1));
    }



}
