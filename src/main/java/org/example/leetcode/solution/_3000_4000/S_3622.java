
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3622 {
    public static void main(String[] args) {
        var solution = new S_3622();

        Utils.print(solution.checkDivisibility(10));
//        Utils.print(solution.checkDivisibility(8));
//        Utils.print(solution.checkDivisibility(99));
//        Utils.print(solution.checkDivisibility(23));
    }

    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return original % (sum + product) == 0;
    }
}