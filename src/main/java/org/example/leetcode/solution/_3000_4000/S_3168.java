package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3168 {
    public static void main(String[] args) {
        var solution = new S_3168();

        System.out.println(solution.minimumChairs("EEEEEEE"));
        System.out.println(solution.minimumChairs("ELELEEL"));
    }

    public int minimumChairs(String s) {
        int count = 0, max = 0;
        for (char c : s.toCharArray()) {
            count = count + (c == 'E' ? 1 : -1);
            if (count > max) max = count;
        }
        return max;
    }
}