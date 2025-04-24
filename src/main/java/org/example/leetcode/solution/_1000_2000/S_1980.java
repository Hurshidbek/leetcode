package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.Arrays;

public class S_1980 {
    public static void main(String[] args) {
        var solution = new S_1980();

        System.out.println(solution.findDifferentBinaryString(new String[]{"0000000111","0000001001","0000000100","0000000001","0000000010","1111111111","0000000101","0000000000","0000001000","0000000110"}));
        System.out.println(solution.findDifferentBinaryString(new String[]{"00","01"}));
        System.out.println(solution.findDifferentBinaryString(new String[]{"111","011","001"}));
    }

    public String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);
        int i = -1;
        while (++i < nums.length)
            if (i != Long.parseLong(nums[i], 2))
                break;
        return String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');
    }

}