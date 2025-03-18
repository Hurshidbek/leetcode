package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

public class S_2160 {
    public static void main(String[] args) {
        S_2160 solution = new S_2160();

        System.out.println(solution.minimumSum(2932));
    }

    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        return arr[0] * 10 + arr[2] + arr[1] * 10 + arr[3];
    }
}
