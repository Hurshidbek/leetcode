package org.example.leetcode.solution._0_1000;

import java.util.List;

public class S_31 {
    public static void main(String[] args) {
        S_31 solution = new S_31();

        List<int[]> list = List.of(
                new int[]{1, 3, 2},
                new int[]{1, 2},
                new int[]{7, 6, 4, 5, 3, 2, 1},
                new int[]{1, 2, 3, 5, 4, 6, 7},
                new int[]{2, 3, 1},
                new int[]{3, 2, 1},
                new int[]{1, 1, 5}
        );

        for (int[] nums : list) solution.nextPermutation(nums);
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = nums.length-1;
            while (nums[i] >= nums[j]) j--;
            swap(nums, i, j);
        }

        reverse(nums, ++i, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) swap(nums, i++, j--);
    }

//    public void nextPermutation(int[] nums) {
//        int n = nums.length;
//        int i = n - 2;
//
//        // Step 1: Find first decreasing element
//        while (i >= 0 && nums[i] >= nums[i + 1]) {
//            i--;
//        }
//
//        // Step 2: Find the next larger element and swap
//        if (i >= 0) {
//            int j = n - 1;
//            while (nums[j] <= nums[i]) {
//                j--;
//            }
//            swap(nums, i, j);
//        }
//
//        // Step 3: Reverse the suffix
//        reverse(nums, i + 1, n - 1);
//
//        System.out.println(Arrays.toString(nums));
//    }
//
//    private void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//    private void reverse(int[] nums, int start, int end) {
//        while (start < end) swap(nums, start++, end--);
//    }

}