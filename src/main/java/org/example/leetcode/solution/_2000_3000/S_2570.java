package org.example.leetcode.solution._2000_3000;

import java.util.*;

class S_2570 {
    public static void main(String[] args) {
        var solution = new S_2570();

        System.out.println(Arrays.deepToString(
                solution.mergeArrays(new int[][]{{2,4},{3,6},{5,5}}, new int[][]{{1,3},{4,3}})));
        System.out.println(Arrays.deepToString(
                solution.mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}})));
    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] nums : nums1) {
            map.put(nums[0], nums[1]);
        }
        for (int[] nums : nums2) {
            map.merge(nums[0], nums[1], Integer::sum);
        }
        int[][] res = new int[map.size()][2];
        int ind = 0;
        for (int i : map.keySet()) {
            res[ind++] = new int[]{i, map.get(i)};

        }
        return res;

//        return res;
//        int[] nums = new int[1001];
//        int count = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums[nums1[i][0]] == 0 || nums[nums2[i][0]] == 0) count++;
//            nums[nums1[i][0]]+=nums1[i][1];
//            nums[nums2[i][0]]+=nums2[i][1];
//        }
//        int[][] res = new int[count][2];
//        int ind = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>0){
//                res[ind++] = new int[]{i, nums[i]};
//            }
//        }
//        return res;
    }
}