package org.example.leetcode.solution._3000_4000;

class S_3105 {
    public static void main(String[] args) {
        var solution = new S_3105();

        solution.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2});
    }

    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 1) return 1;

        int max = 1, up = 1, down = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up++;
                down = 1;
            } else if (nums[i] < nums[i - 1]) {
                down++;
                up = 1;
            } else {
                up = 1;
                down = 1;
            }
            max = Math.max(max, Math.max(up, down));
        }

        return max;
    }
}
