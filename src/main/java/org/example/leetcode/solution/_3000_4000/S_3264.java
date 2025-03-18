package org.example.leetcode.solution._3000_4000;

class S_3264 {
    public static void main(String[] args) {
        var solution = new S_3264();

        solution.getFinalState(new int[]{1}, 10, 5);
        solution.getFinalState(new int[]{1,2}, 3, 4);
        solution.getFinalState(new int[]{2,1,3,5,6}, 5, 2);
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 1; i <= k; i++){
            int minInd = -1;
            int minVal = Integer.MAX_VALUE;
            for(int j = 0; j < nums.length; j++){
                if(minVal > nums[j]){
                    minInd = j;
                    minVal = nums[j];
                }
            }
            nums[minInd] = nums[minInd] * multiplier;
        }
        return nums;
    }
}