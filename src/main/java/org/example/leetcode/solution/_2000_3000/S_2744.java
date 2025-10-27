package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2744 {
    public static void main(String[] args) {
        var solution = new S_2744();

        System.out.println(solution.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}