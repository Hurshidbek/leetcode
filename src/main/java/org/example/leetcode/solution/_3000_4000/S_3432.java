package org.example.leetcode.solution._3000_4000;

class S_3432 {
    public static void main(String[] args) {
        var solution = new S_3432();

        solution.countPartitions(new int[]{10,10,3,7,6});
    }

    public int countPartitions(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        for(int i = 0; i < len; i++){
            leftSum[i] = (i > 0 ? leftSum[i-1] : 0) + nums[i];
            rightSum[len-1-i] = (i > 0 ? rightSum[len-i] : 0) + nums[len-1-i];
        }

        int count = 0;
        for(int i = 0; i < len-1; i++){
            int abs = Math.abs(leftSum[i] - (i < len - 1 ? rightSum[i + 1] : 0));
            if (abs % 2 == 0){
                count++;
            }
        }

        return count;
    }
}