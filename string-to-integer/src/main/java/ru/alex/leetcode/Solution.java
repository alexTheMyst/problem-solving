package ru.alex.leetcode;

/**
 * @author alexey
 * @version 7/4/18
 */
public class Solution {
    public int myAtoi(String str) {
        String workingStrCopy = str.trim();
        int pointer = 0;
        boolean isNegative = false;
        if (workingStrCopy.startsWith("-")) {
            isNegative = true;
            pointer++;
        }
        if (workingStrCopy.startsWith("+")) {
            pointer++;
        }
        long result = 0;
        while (pointer < workingStrCopy.length()) {
            result = result * 10;
            char currentChar = workingStrCopy.charAt(pointer++);
            int numericValue = Character.getNumericValue(currentChar);
            if (numericValue > 10) break;
            if (numericValue >= 0 && numericValue < 10) {
                result = result + numericValue;
                if (result > Integer.MAX_VALUE) break;
            }
        }
        result = (isNegative) ? result * -1 : result;
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
