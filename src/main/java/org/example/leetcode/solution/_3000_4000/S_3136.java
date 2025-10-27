package org.example.leetcode.solution._3000_4000;

public class S_3136 {
    public static void main(String[] args) {
        var solution = new S_3136();

        System.out.println(solution.isValid("UuE6"));
    }

    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsotant = false;
        String VOWELS = "aeiouAEIOU";

        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                return false;
            } else if (VOWELS.indexOf(c) != -1) {
                hasVowel = true;
            } else if (VOWELS.indexOf(c) == -1 && !Character.isDigit(c)) {
                hasConsotant = true;
            }
        }

        return hasVowel && hasConsotant;
    }
}