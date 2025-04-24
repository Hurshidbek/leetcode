package org.example.leetcode.solution._1000_2000;

import java.util.HashMap;
import java.util.Map;

public class S_1726 {
    public static void main(String[] args) {
        var solution = new S_1726();

        System.out.println(solution.tupleSameProduct(new int[]{2, 3, 4, 6}));
    }

    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += 8 * (map.merge(nums[i] * nums[j], 1, Integer::sum) - 1);
            }
        }
        return count;
    }

    public int tupleSameProduct2(int[] nums) {
        int sum = 0, len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> resMap = new HashMap<>();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int num = nums[i] * nums[j];
                map.merge(num, 1, Integer::sum);
                if (map.get(num) != 1) {
                    resMap.put(num, map.get(num));
                }
            }
        }

        for (int i : resMap.values()) {
            sum += 8 * i * (i - 1) / 2;
        }

        return sum;
    }
}