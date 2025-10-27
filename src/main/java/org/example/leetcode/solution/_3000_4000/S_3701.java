
package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;

public class S_3701 {
    public static void main(String[] args) {
        var solution = new S_3701();

        System.out.println(solution.alternatingSum(new int[]{1, 3, 5, 7}));
    }

    public int alternatingSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i++];
            if (i < nums.length) {
                res -= nums[i];
            }
        }
        return res;
    }
}