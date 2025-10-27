
package org.example.leetcode.solution._3000_4000;

public class S_3461 {
    public static void main(String[] args) {
        var solution = new S_3461();

        System.out.println(solution.hasSameDigits("3902"));
    }

    public boolean hasSameDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i <= s.length() - 2; i++) {
            for (int j = 0; j <= s.length() - 1 - i; j++) {
                arr[j] = (char) ((arr[j] + arr[j + 1] - 2 * '0') % 10 + '0');
            }
        }
        return arr[0] == arr[1];
    }
}