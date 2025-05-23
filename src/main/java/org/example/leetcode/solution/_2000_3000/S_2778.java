package org.example.leetcode.solution._2000_3000;

public class S_2778 {
    public static void main(String[] args) {
        var solution = new S_2778();

        System.out.println(solution.sumOfSquares(new int[]{1, 2, 3, 4}));
    }

    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0) {
                sum += nums[i-1] * nums[i-1];
            }
        }
        return sum;
    }
}