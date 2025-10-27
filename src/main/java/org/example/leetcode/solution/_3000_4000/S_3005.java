package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3005 {
    public static void main(String[] args) {
        var solution = new S_3005();

        System.out.println(solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4}));
        System.out.println(solution.maxFrequencyElements(new int[]{1, 2, 3, 4, 5}));
    }

    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0, maxFreqCount = 0;
        for (int i : nums) {
            freq[i]++;
            if (freq[i] > maxFreq) {
                maxFreqCount = 1;
                maxFreq = freq[i];
            } else if (freq[i] == maxFreq) {
                maxFreqCount++;
            }
        }
        return maxFreqCount * maxFreq;
    }
}