package org.example.leetcode.solution._0_1000;

public class S_263 {
    public static void main(String[] args) {
        var solution = new S_263();

        solution.isUgly(4);
    }

    public boolean isUgly(int n) {
        while (n % 2 == 0) n /= 2;
            while (n % 3 == 0) n /= 3;
            while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}
