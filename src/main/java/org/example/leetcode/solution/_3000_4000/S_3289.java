package org.example.leetcode.solution._3000_4000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S_3289 {
    public static void main(String[] args) {
        var solution = new S_3289();
        System.out.println(Arrays.toString(solution.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})));
    }

    Set<Integer> set = new HashSet<>();

    public int[] getSneakyNumbers(int[] nums) {
        int[] res = {-1, -1};
        for (int i : nums) {
            if (!set.add(i)) {
                if (res[0] < 0) res[0] = i;
                else res[1] = i;
            }
        }
        return res;
    }
}