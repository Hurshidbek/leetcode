package org.example.leetcode.solution._1000_2000;

import java.util.HashMap;
import java.util.Map;

class S_1399 {
    public static void main(String[] args) {
        var solution = new S_1399();

        System.out.println(solution.countLargestGroup(13));
    }

    public int countLargestGroup(int n) {
        int[] digitSums = new int[37];
        for (int i = 1; i <= n; i++) {
            int num = i;
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            digitSums[digitSum]++;
        }

        int max = 0, maxCount = 0;
        for (int i : digitSums) {
            if (i > max) {
                max = i;
                maxCount = 1;
            } else if (i == max) {
                maxCount++;
            }
        }

        return maxCount;
    }
}