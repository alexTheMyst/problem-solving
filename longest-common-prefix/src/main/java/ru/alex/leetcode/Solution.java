package ru.alex.leetcode;

/**
 * @author alexey
 * @version 7/9/18
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        StringBuilder stringBuilder = new StringBuilder();
        String firstWord = strs[0];
        if (firstWord.length() == 0) return stringBuilder.toString();
        for (int letterIndex = 0; letterIndex < firstWord.length(); letterIndex++) {
            char letter = firstWord.charAt(letterIndex);
            boolean charExistsInAllWords = true;
            for (String eachString : strs) {
                if (eachString.length() < letterIndex + 1) {
                    charExistsInAllWords = false;
                    break;
                } else {
                    char charAt = eachString.charAt(letterIndex);
                    if (!(letter == charAt)) {
                        charExistsInAllWords = false;
                        break;
                    }
                }
            }
            if (charExistsInAllWords) {
                stringBuilder.append(letter);
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
