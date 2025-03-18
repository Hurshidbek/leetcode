package org.example.leetcode.solution._0_1000;

import java.util.List;

public class S_41 {
    public static void main(String[] args) {
        S_41 solution = new S_41();
        List<int[]> lists = List.of(
                new int[]{2,2,2,2,2},
                new int[]{1, 2, 0},
                new int[]{3, 4, -1, 1}
        );

        for (int[] nums : lists) System.out.println(solution.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0
                    && nums[i] <= nums.length
                    && nums[nums[i] - 1] != nums[i]
            ) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
