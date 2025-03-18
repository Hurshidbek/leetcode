package org.example.leetcode.solution._2000_3000;

class S_2535 {
    public static void main(String[] args) {
        var solution = new S_2535();

        solution.differenceOfSum(new int[]{1, 4, 3, 3, 2});
    }

    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int i : nums) {
            elementSum += i;
            while (i > 0){
                digitSum += i % 10;
                i /= 10;
            }
        }
        return elementSum - digitSum;
    }
}
