package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2044 {
    public static void main(String[] args) {
        var solution = new S_2044();

        System.out.println(solution.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }

    int maxOr = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        dfs(nums, 0, 0);
        return count;
    }


    public void dfs(int[] nums, int ind, int currOr) {

        if (ind == nums.length) {
            if (currOr > maxOr) {
                maxOr = currOr;
                count = 1;
            } else if (currOr == maxOr) {
                count++;
            }
            return;
        }

        dfs(nums, ind + 1, currOr | nums[ind]);
        dfs(nums, ind + 1, currOr);
    }
}