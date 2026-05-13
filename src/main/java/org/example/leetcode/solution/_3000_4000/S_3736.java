
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3736 {
    public static void main(String[] args) {
        var solution = new S_3736();

        Utils.print(solution.minMoves(new int[]{2, 1, 3}));
    }

    public int minMoves(int[] nums) {
        int sum = 0, max = 0;
        for (int i : nums) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }
        return max * nums.length - sum;
    }
}