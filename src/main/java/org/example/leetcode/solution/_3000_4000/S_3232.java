package org.example.leetcode.solution._3000_4000;

public class S_3232 {
    public static void main(String[] args) {
        S_3232 solution = new S_3232();

        System.out.println(solution.canAliceWin(new int[]{1,2,3,4,10}));
    }


    public boolean canAliceWin(int[] nums) {
        int isSumOfSingle = 0;
        for (int i: nums) {
            if (i < 10) {
                isSumOfSingle += i;
            } else {
                isSumOfSingle -= i;
            }
        }
        return isSumOfSingle != 0;
    }
}
