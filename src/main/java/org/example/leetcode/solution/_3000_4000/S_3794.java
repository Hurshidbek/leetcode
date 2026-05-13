
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3794 {
    public static void main(String[] args) {
        var solution = new S_3794();

        Utils.print(solution.reversePrefix("abcd", 2));
    }

    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < k / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }
        return new String(arr);
    }
}