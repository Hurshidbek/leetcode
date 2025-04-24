package org.example.leetcode.solution._1000_2000;

import java.util.ArrayList;
import java.util.List;

public class S_1358 {
    public static void main(String[] args) {
        var solution = new S_1358();

        System.out.println(solution.numberOfSubstrings("abcabc")); // 10
        System.out.println(solution.numberOfSubstrings("aaacbb")); // 6
        System.out.println(solution.numberOfSubstrings("aaacb")); // 3
    }

    public int numberOfSubstrings(String s) {
        int[] abc = new int[3];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            abc[s.charAt(i) - 'a'] = i + 1;
            count += Math.min(abc[0], Math.min(abc[1], abc[2]));
        }
        return count;
    }

    public int numberOfSubstrings1(String s) {
        int countA = 0, countB = 0, countC = 0;
        int left = 0, right = 0;
        int resCount = 0;

        while (left < s.length()) {
            if (countA > 0 && countB > 0 && countC > 0) {
                resCount += s.length() - right + 1;

                if (s.charAt(left) == 'a') countA--;
                else if (s.charAt(left) == 'b') countB--;
                else if (s.charAt(left) == 'c') countC--;
                left++;
            } else if (right < s.length()) {
                if (s.charAt(right) == 'a') countA++;
                else if (s.charAt(right) == 'b') countB++;
                else if (s.charAt(right) == 'c') countC++;
                right++;
            } else {
                break;
            }
        }

        return resCount;
    }

    public int numberOfSubstrings2(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length - 2; i++) {
            List<String> list = new ArrayList<>(List.of("a", "b", "c"));
            char first = s.charAt(i);
            list.remove(first + "");
            int second_index = s.indexOf(list.get(0), i);
            int third_index = s.indexOf(list.get(1), i);
            if (second_index == -1 || third_index == -1) break;

            int max_index = Math.max(second_index, third_index);
            count += length - max_index;
        }

        return count;
    }
}