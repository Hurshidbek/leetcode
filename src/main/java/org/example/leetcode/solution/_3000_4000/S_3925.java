
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3925 {
    public static void main(String[] args) {
        var solution = new S_3925();

        Utils.print(solution.concatWithReverse(new int[]{1, 2, 3}));
    }

    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int[] res = new int[len * 2];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i];
            res[len * 2 - i - 1] = nums[i];
        }
        return res;
    }
}