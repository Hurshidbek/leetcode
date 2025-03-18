package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

class S_2136 {
    public static void main(String[] args) {
        var solution = new S_2136();

        System.out.println(solution.earliestFullBloom(new int[]{1, 4, 3}, new int[]{2, 3, 1}));
    }

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] seeds = new int[n][2];

        // Store growTime and plantTime together
        for (int i = 0; i < n; i++) {
            seeds[i][0] = growTime[i]; // Sort by grow time (descending)
            seeds[i][1] = plantTime[i];
        }

        // Sort seeds by growTime in descending order
        Arrays.sort(seeds, (a, b) -> Integer.compare(b[0], a[0]));

        int plantingDays = 0;
        int bloomDay = 0;

        for (int[] seed : seeds) {
            plantingDays += seed[1]; // Add planting time
            bloomDay = Math.max(bloomDay, plantingDays + seed[0]); // Update bloom time
        }

        return bloomDay;
    }

}