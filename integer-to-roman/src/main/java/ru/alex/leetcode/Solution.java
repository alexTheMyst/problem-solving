package ru.alex.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author alexey
 * @version 7/5/18
 */
public class Solution {
    public String intToRom(int x) {
        Map<Integer, String> intToRoman = new LinkedHashMap<>();
        intToRoman.put(1000, "M");
        intToRoman.put(900, "CM");
        intToRoman.put(500, "D");
        intToRoman.put(400, "CD");
        intToRoman.put(100, "C");
        intToRoman.put(90, "XC");
        intToRoman.put(50, "L");
        intToRoman.put(40, "XL");
        intToRoman.put(10, "X");
        intToRoman.put(9, "IX");
        intToRoman.put(5, "V");
        intToRoman.put(4, "IV");
        intToRoman.put(1, "I");

        int y = x;
        StringBuffer result = new StringBuffer();
        for (Map.Entry<Integer, String> entry : intToRoman.entrySet()) {
            while (y / entry.getKey() > 0) {
                result.append(entry.getValue());
                y -= entry.getKey();
            }
        }
        return result.toString();
    }
}
