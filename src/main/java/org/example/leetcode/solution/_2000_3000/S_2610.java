package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.List;

public class S_2610 {
    public static void main(String[] args) {
        var solution = new S_2610();

        System.out.println(solution.findMatrix(new int[]{4, 5, 3, 3, 3}));
//        System.out.println(solution.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
    }

    public List<List<Integer>> findMatrix(int[] nums) {

        int[] arr = new int[nums.length + 1];
        List<List<Integer>> results = new ArrayList<>();

        for (int i : nums) {
            if (arr[i] >= results.size()) results.add(new ArrayList<>());
            results.get(arr[i]).add(i);
            arr[i]++;
        }

        return results;
    }

    public List<List<Integer>> findMatrix1(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len + 1];
        int[][] mat = new int[len + 1][len + 1];

        List<List<Integer>> res = new ArrayList<>();

        for (int i : nums) {
            arr[i]++;
            mat[arr[i]][i]++;
        }

        for (int i = 1; i <= len; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= len; j++) {
                if (mat[i][j] > 0) {
                    list.add(j);
                }
            }
            if (!list.isEmpty()) {
                res.add(list);
            }
        }

        return res;
    }
}