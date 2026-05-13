
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3783 {
    public static void main(String[] args) {
        var solution = new S_3783();

        Utils.print(solution.mirrorDistance(25));
    }

    public int mirrorDistance(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return Math.abs(original - reverse);
    }
}