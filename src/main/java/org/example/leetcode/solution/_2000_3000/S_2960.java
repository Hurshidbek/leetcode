package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_2960 {
    public static void main(String[] args) {
        var solution = new S_2960();

        System.out.println(solution.countTestedDevices(new int[]{1, 1, 2, 1, 3}));
    }

    public int countTestedDevices(int[] batteryPercentages) {

        int res = 0;

        for (int i : batteryPercentages) {
            if (i > res) {
                res++;
            }
        }

        Number a = 1;
        List<? super Number> arr = new ArrayList<>();
        arr.add(a);

        return res;
    }
}