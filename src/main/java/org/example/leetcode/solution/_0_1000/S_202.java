package org.example.leetcode.solution._0_1000;

public class S_202 {
    public static void main(String[] args) {
        var solution = new S_202();

        solution.isHappy(4);
    }

    public boolean isHappy(int n) {
        if (n < 10) return n == 1 || n == 7;
        else {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
}
