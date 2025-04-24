package org.example.leetcode.solution._3000_4000;

public class S_3079 {
    public static void main(String[] args) {
        var solution = new S_3079();

        System.out.println(solution.sumOfEncryptedInt(new int[]{10,21,31}));
        System.out.println(solution.sumOfEncryptedInt(new int[]{1,2,3}));
    }

    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i: nums) {
            int count = 0;
            int max = 0;
            while (i > 0){
                max = Math.max(max, i%10);
                i/=10;
                count++;
            }
            while (count-->0){
                sum+=max;
                max*=10;
            }
        }
        return sum;
    }
}