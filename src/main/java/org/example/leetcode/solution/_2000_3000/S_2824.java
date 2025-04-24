package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class S_2824 {
    public static void main(String[] args) {
        var solution = new S_2824();

        System.out.println(solution.countPairs(Arrays.asList(-1, 1, 1, 2, 3), 2));
    }

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0, left = 0, right = nums.size() - 1;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left++;
            } else {
                right--;
            }
        }
        return count;
    }
}