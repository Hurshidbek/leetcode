package org.example.leetcode.solution._0_1000;

import java.util.Arrays;

class S_164 {


    public static void main(String[] args) {
        var solution = new S_164();

//        System.out.println(solution.maximumGap(new int[]{1, 10000000}));
        System.out.println(solution.maximumGap(new int[]{3, 6, 9, 1}));
    }

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // If all numbers are the same, the gap is 0
        if (min == max) {
            return 0;
        }

        // Calculate the bucket size and number of buckets
        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        // Create buckets to store the minimum and maximum values in each bucket
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        // Place each number in the corresponding bucket
        for (int num : nums) {
            int bucketIndex = (num - min) / bucketSize;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
        }

        // Find the maximum gap between successive non-empty buckets
        int maxGap = 0;
        int prevMax = min;
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) {
                continue; // Skip empty buckets
            }
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }

    public int maximumGap1(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i + 1]);
        }
        return max;
    }
}