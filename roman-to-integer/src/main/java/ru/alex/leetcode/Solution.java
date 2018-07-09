package ru.alex.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author alexey
 * @version 7/6/18
 */
public class Solution {
    public int romanToInt(String str) {
        Map<String, Integer> roman = new LinkedHashMap<>();
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);

        int result = 0;

        for (Map.Entry<String, Integer> romanIntPair : roman.entrySet()) {
            while (str.length() > 0 && str.startsWith(romanIntPair.getKey())) {
                result += romanIntPair.getValue();
                str = str.substring(romanIntPair.getKey().length(), str.length());
            }
        }
        return result;
    }
}
