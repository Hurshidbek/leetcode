package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S_2956 {
    public static void main(String[] args) {
        var solution = new S_2956();

        System.out.println(Arrays.toString(solution.findIntersectionValues(new int[]{2, 3, 2}, new int[]{1,2})));
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.merge(i, 1, Integer::sum);
        }

        int count1 = 0, count2 = 0;
        for (int i : nums2) {
            if (map.get(i) != null) {
                count1 += map.get(i);
                count2++;
                map.put(i, 0);
            }
        }

        return new int[]{count1, count2};
    }
}