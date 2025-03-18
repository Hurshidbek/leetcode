package org.example.leetcode.solution._2000_3000;

import java.util.HashMap;
import java.util.Map;

public class S_2391 {
    public static void main(String[] args) {
        S_2391 solution = new S_2391();

        System.out.println(solution.garbageCollection(new String[]{"MMM", "PGM", "GP"}, new int[]{3, 10}));
        System.out.println(solution.garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3}));
    }


    public int garbageCollection(String[] garbage, int[] travel) {
        boolean[] nums = new boolean[3]; // M, G, P
        int sum = garbage[0].length();
        for (int i = garbage.length - 1; i > 0; i--) {
            if (!nums[0] || !nums[1] || !nums[2]) {
                for (char c : garbage[i].toCharArray()) {
                    if (c == 'M' && !nums[0]) {
                        nums[0] = true;
                    } else if (c == 'G' && !nums[1]) {
                        nums[1] = true;
                    } else if (c == 'P' && !nums[2]) {
                        nums[2] = true;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (nums[j]) {
                        sum += travel[i - 1];
                    }
                }
                sum += garbage[i].length();
            } else {
                sum += garbage[i].length() + 3 * travel[i - 1];
            }
        }

        return sum;
    }

}
