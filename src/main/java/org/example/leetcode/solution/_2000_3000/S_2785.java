package org.example.leetcode.solution._2000_3000;

import java.util.*;

public class S_2785 {
    public static void main(String[] args) {
        var solution = new S_2785();

        System.out.println("lEOtcede".equals(solution.sortVowels("lEetcOde")));
        System.out.println("lYmpH".equals(solution.sortVowels("lYmpH")));
    }

    public String sortVowels(String s) {
        boolean[] vowel = new boolean[256];
        for (char c : "AEIOUaeiou".toCharArray()) {
            vowel[c] = true;
        }

        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            if (vowel[c]) freq[c]++;
        }

        int p = 0;
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (!vowel[c]) {
                sb.append(c);
            } else {
                while (freq[p] == 0) p++;
                sb.append((char) p);
                freq[p]--;
            }
        }
        return sb.toString();
    }
}