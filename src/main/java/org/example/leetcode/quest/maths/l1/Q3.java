package org.example.leetcode.quest.maths.l1;

import org.example.leetcode.solution.dictionaries.Utils;

public class Q3 {
    public static void main(String[] args) {
        Q3 solution = new Q3();

        Utils.print(solution.isPalindrome(121));
        Utils.print(solution.isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev == temp;
    }

    public boolean isPalindrome1(int x) {
        String s = "" + x;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}