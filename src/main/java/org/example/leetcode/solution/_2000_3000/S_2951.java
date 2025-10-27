package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.List;

public class S_2951 {
    public static void main(String[] args) {
        var solution = new S_2951();

        System.out.println(solution.findPeaks(new int[]{2, 4, 4}));
    }

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                list.add(i++);
            }
        }
        return list;
    }
}