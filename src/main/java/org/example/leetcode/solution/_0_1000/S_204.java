package org.example.leetcode.solution._0_1000;

import java.util.stream.IntStream;

public class S_204 {
    public static void main(String[] args) {
        S_204 solution = new S_204();

        System.out.println(solution.countPrimes(10));
        System.out.println(solution.countPrimes(499979));
        System.out.println(solution.countPrimes(3));
        System.out.println(solution.countPrimes(5));
        System.out.println(solution.countPrimes(7));
        System.out.println(solution.countPrimes(8));
        System.out.println(solution.countPrimes(0));
        System.out.println(solution.countPrimes(1));
        System.out.println(solution.countPrimes(2));
    }

    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isNotPrime = new boolean[n];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int p = 2; p * p < n; p++) {
            if (!isNotPrime[p]) {
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isNotPrime[multiple] = true;
                }
            }
        }
        return (int) IntStream.range(0, isNotPrime.length)
                .filter(i -> !isNotPrime[i])
                .count();
    }

    int countPrimes2(int target) {
        int count = 0;

        for (int i = 2; i < target; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }


}
