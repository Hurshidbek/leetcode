
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3917 {
    public static void main(String[] args) {
        var solution = new S_3917();

        Utils.print(solution.countOppositeParity(new int[]{5, 1}));
        Utils.print(solution.countOppositeParity(new int[]{1, 2, 3, 4}));
    }

    public int[] countOppositeParity(int[] nums) {

        int len = nums.length;
        int oddCount = 0;
        int evenCount = 0;
        int[] res = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                res[i] = oddCount;
                evenCount++;
            } else {
                res[i] = evenCount;
                oddCount++;
            }
        }

        return res;
    }
}