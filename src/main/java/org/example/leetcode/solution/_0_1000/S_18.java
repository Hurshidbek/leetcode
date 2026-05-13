package org.example.leetcode.solution._0_1000;

import java.util.*;

public class S_18 {
    public static void main(String[] args) {
        var solution = new S_18();

        System.out.println(solution.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296) + "\n");
        System.out.println(solution.fourSum(new int[]{2, 4, 0, 4, -3, -3}, 0) + "\n");
        System.out.println(solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0) + "\n");
        System.out.println(solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8) + "\n");
        System.out.println(solution.fourSum(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, 8) + "\n");
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1;
                int r = n - 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        do l++; while (l < r && nums[l] == nums[l - 1]);
                        do r--; while (l < r && nums[r] == nums[r + 1]);
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return result;
    }

    public List<List<Integer>> fourSum1(int[] nums, int target) {

        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < len - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                    for (int l = k + 1; l < len; l++) {
                        if (l > k + 1 && nums[l] == nums[l - 1]) continue;
                        if (1L * nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            list.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        return list;
    }
}