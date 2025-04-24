package org.example.leetcode.solution._2000_3000;

public class S_2427 {
    public static void main(String[] args) {
        var solution = new S_2427();

        solution.commonFactors(12, 6);
    }
    public int commonFactors(int a, int b) {
        return countFactors(gcd(a, b));
    }

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++; // Perfect square case (count only once)
                } else {
                    count += 2; // Count both divisors
                }
            }
        }
        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}