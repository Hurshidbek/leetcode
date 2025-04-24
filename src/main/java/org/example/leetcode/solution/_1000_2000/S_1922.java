package org.example.leetcode.solution._1000_2000;


import org.example.leetcode.solution.dictionaries.Utils;

import java.math.BigInteger;

class S_1922 {
    public static void main(String[] args) {
        var solution = new S_1922();

        System.out.println(564908303 == solution.countGoodNumbers(50));
    }

    long modulo = (int) (Math.pow(10, 9) + 7);

    public int countGoodNumbers(long n) {
        long primePositions = n++ / 2;
        long oddPositions = n / 2;

        long primeCount = modPow(4, primePositions);
        long oddCount = modPow(5, oddPositions);

        long res = (primeCount * oddCount) % modulo;

        return (int) res;
    }

    private long modPow(long base, long exp) {
        long result = 1;
        base = base % modulo;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % modulo;
            }
            base = (base * base) % modulo;
            exp >>= 1;
        }
        return result;
    }
}