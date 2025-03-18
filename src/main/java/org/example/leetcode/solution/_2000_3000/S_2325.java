package org.example.leetcode.solution._2000_3000;

import java.util.Arrays;

class S_2325 {
    public static void main(String[] args) {
        var solution = new S_2325();

        solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }

    public String decodeMessage(String key, String message) {
        int[] nums = new int[26];
        int count = 1;

        for (char c : key.toCharArray()) {
            if (c != ' ' && nums[c - 'a'] == 0) {
                nums[c - 'a'] = count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c != ' ') {
                c = (char) (nums[c - 'a'] + 'a' - 1);
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
