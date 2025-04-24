package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

class S_2563 {
    public static void main(String[] args) {
        var solution = new S_2563();

        System.out.println(solution.countFairPairs(new int[]{0, 1, 7, 4, 4, 5}, 3, 6));
    }


    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    public long countPairs(int[] nums, int target) {
        long count = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] <= target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}