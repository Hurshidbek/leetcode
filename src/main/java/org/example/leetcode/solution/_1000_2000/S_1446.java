package org.example.leetcode.solution._1000_2000;

public class S_1446 {
    public static void main(String[] args) {
        var solution = new S_1446();

        System.out.println(solution.maxPower("leetcode"));
        System.out.println(solution.maxPower("abbcccddddeeeeedcba"));
    }

    public int maxPower(String s) {
        int a = 1;
        int max = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                a++;
                if (a > max) max = a;
            } else {
                a = 1;
            }
        }

        return max;
    }
}