package org.example.leetcode.solution._0_1000;

import java.util.ArrayList;
import java.util.List;

public class S_17 {
    public static void main(String[] args) {
        var solution = new S_17();

        System.out.println(solution.letterCombinations("23"));
    }

    String[] phoneArray = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> combos = new ArrayList();

        letterHelper(digits, new StringBuilder(), 0, combos);

        return combos;
    }

    private void letterHelper(String digits, StringBuilder current, int index, List<String> combos) {
        if (index == digits.length()) {
            combos.add(current.toString());
            return;
        }

        int currentDigit = Character.getNumericValue(digits.charAt(index));
        String phoneChars = phoneArray[currentDigit - 2];

        for (int i = 0; i < phoneChars.length(); i++) {
            char c = phoneChars.charAt(i);
            current.append(c);
            letterHelper(digits, current, index + 1, combos);
            current.deleteCharAt(current.length() - 1);
        }
    }
}