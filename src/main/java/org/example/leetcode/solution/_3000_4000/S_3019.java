package org.example.leetcode.solution._3000_4000;

public class S_3019 {
    public static void main(String[] args) {
        var solution = new S_3019();

        System.out.println(solution.countKeyChanges("aAbBcC"));
    }

    public int countKeyChanges(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 1) - 32 && s.charAt(i) != s.charAt(i - 1) + 32) {
                count++;
            }
        }
        return count;
    }
}