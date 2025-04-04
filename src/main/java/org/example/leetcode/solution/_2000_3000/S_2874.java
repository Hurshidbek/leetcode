package org.example.leetcode.solution._2000_3000;

class S_2874 {
    public static void main(String[] args) {
        var solution = new S_2874();

        System.out.println(solution.maximumTripletValue(new int[]{1000000,1,1000000}));
        System.out.println(solution.maximumTripletValue(new int[]{12, 6, 1, 2, 7}));
    }

    public long maximumTripletValue(int[] nums) {
        long maxLeft = 0, maxSubtraction = 0, res = 0;

        for (int j = 1; j < nums.length - 1; j++) {
            maxLeft = Math.max(maxLeft, nums[j - 1]);
            maxSubtraction = Math.max(maxSubtraction, maxLeft - nums[j]);
            res = Math.max(res, maxSubtraction * nums[j + 1]);
        }

        return res;
    }
}