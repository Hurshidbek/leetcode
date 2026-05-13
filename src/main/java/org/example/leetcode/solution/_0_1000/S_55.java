package org.example.leetcode.solution._0_1000;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S_55 {
    public static void main(String[] args) {
        var solution = new S_55();

//        System.out.println(solution.canJump(new int[]{2, 0, 0}));
//        System.out.println(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean canJump(int[] nums) {
        int remaining = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && remaining == 0) return false;
            if (remaining-- < nums[i]) remaining = --nums[i];
        }
        return true;
    }

    int[] nums;
    int len;

    public boolean canJump1(int[] nums) {
        this.nums = nums;
        this.len = nums.length - 1;

        return canJump(0);
    }


    public boolean canJump(int index) {
        if (index == len) return true;
        if (nums[index] == 0) return false;
        for (int i = index + 1; i <= index + nums[index]; i++) {
            if (canJump(i)) {
                return true;
            }
        }
        nums[index] = 0;
        return false;
    }

}