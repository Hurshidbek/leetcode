package org.example.leetcode.solution._2000_3000;

public class S_2401 {
    public static void main(String[] args) {
        var solution = new S_2401();

        System.out.println(solution.longestNiceSubarray(new int[]{1_000_000_000, 3, 8, 48, 10}));
    }

    public int longestNiceSubarray(int[] nums) {
        int left = 0, bitMask = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            while ((bitMask & nums[right]) != 0) bitMask ^= nums[left++];
            bitMask |= nums[right];
            count = Math.max(count, right - left + 1);
        }
        return count;
    }

    // not correct
    public int longestNiceSubarray2(int[] nums) {
        int count = nums.length;
        int len = nums.length;

        while (len > 0) {
            int tempCount = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0 && nums[i] % 2 == 1) {
                    tempCount++;
                }
                nums[i] /= 2;
            }
            if (tempCount > 1) {
                count -= tempCount - 1;
            }
        }

        return count;
    }

    // not correct
    public int longestNiceSubarray1(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] ^ nums[i + 1]) != 0) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }
}