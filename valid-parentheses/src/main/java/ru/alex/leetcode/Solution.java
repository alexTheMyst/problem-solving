package ru.alex.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author alexey
 * @version 7/10/18
 */
public class Solution {
    private final Map<Character, Character> pairs = new HashMap<>();
    private final Stack<Character> characters = new Stack<>();
    {
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
    }

    public boolean isValid(String s) {
        // Special cases
        // ??empty string considered as true
        if (s.length() == 0) return true;
        // odd characters cannot contain full set of pairs
        if (s.length() % 2 != 0)return false;
        // string cannot start with "close" character
        if (!pairs.containsKey(s.charAt(0))) return false;
        // base case
        for (Character sCharacter : s.toCharArray()) {
            if (pairs.containsKey(sCharacter)) {
                characters.push(pairs.get(sCharacter));
            } else if (!characters.empty() && characters.peek().equals(sCharacter)) {
                characters.pop();
            } else {
                return false;
            }
        }
        return characters.empty();
    }
}
