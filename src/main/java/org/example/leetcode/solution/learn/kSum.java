package org.example.leetcode.solution.learn;

import org.example.leetcode.solution._0_1000.S_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kSum {

    public static void main(String[] args) {
        var solution = new kSum();

        System.out.println(solution.kSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296, 4) + "\n");
        System.out.println(solution.kSum(new int[]{2, 4, 0, 4, -3, -3}, 0, 4) + "\n");
        System.out.println(solution.kSum(new int[]{1, 0, -1, 0, -2, 2}, 0, 4) + "\n");
        System.out.println(solution.kSum(new int[]{2, 2, 2, 2, 2}, 8, 4) + "\n");
        System.out.println(solution.kSum(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, 8, 4) + "\n");
    }

    public List<List<Integer>> kSum(int[] nums, int target, int kSum) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, kSum);
    }

    private List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
        List<List<Integer>> res = new ArrayList<>();

        if (k == 2) {
            int l = start;
            int r = nums.length - 1;

            while (l < r) {
                long sum = nums[l] + nums[r];

                if (sum == target) {
                    res.add(Arrays.asList(nums[l], nums[r]));

                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;

                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }

            return res;
        }

        for (int i = start; i < nums.length - k + 1; i++) {

            if (i > start && nums[i] == nums[i - 1]) continue;

            for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {

                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.addAll(subset);
                res.add(list);
            }
        }

        return res;
    }

}
