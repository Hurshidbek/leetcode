package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_2161 {
    public static void main(String[] args) {
        var solution = new S_2161();

        System.out.println(Arrays.toString(solution.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int i = 0, j = nums.length - 1;
        int l = 0, r = nums.length - 1;
        int[] ans = new int[nums.length];

        while(i < nums.length) {
            if(nums[i] < pivot) {
                ans[l++] = nums[i];
            }

            if(nums[j] > pivot) {
                ans[r--] = nums[j];
            }
            i++; j--;
        }

        while(l <= r) {
            ans[l++] = pivot;
        }

        return ans;
    }
}