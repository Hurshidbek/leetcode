
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3838 {
    public static void main(String[] args) {
        var solution = new S_3838();

        Utils.print(solution.mapWordWeights(new String[]{"abcd", "def", "xyz"}, new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2}));
    }

    public String mapWordWeights(String[] words, int[] weights) {
        char[] arr = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            for (char c : words[i].toCharArray()) {
                sum += weights[c - 'a'];
            }
            arr[i] = (char) ('z' - sum % 26);
        }
        return new String(arr);
    }
}