package org.example.leetcode.solution._2000_3000;

public class S_2553 {
    public static void main(String[] args) {
        var solution = new S_2553();

        solution.separateDigits(new int[]{13, 25, 83, 77});
    }


    public int[] separateDigits(int[] nums) {
        int resLen = 0;

        for (int i : nums) {
            while (i > 0) {
                resLen++;
                i /= 10;
            }
        }

        for (int n : nums) resLen += (int) Math.log10(n) + 1;
        int[] res = new int[resLen];

        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                res[--resLen] = nums[i] % 10;
                nums[i] /= 10;
            }
        }

        return res;
    }

    public int alternateDigitSum(int n) {
        int len = (int) Math.log10(n);

        int digitSum = 0;
        while (n > 0) {
            digitSum += (n % 10) * Math.pow(-1, len);
            n /= 10;

            len--;
        }
        return digitSum;
    }

}
