package org.example.leetcode.solution._2000_3000;

public class S_2544 {
    public static void main(String[] args) {
        var solution = new S_2544();

        solution.alternateDigitSum(886996);
    }

    public int alternateDigitSum(int n) {
        int len = (int) Math.log10(n);

        int digitSum = 0;
        while (n > 0) {
            digitSum += (n % 10) * Math.pow(-1, len);
            n /= 10;

            len--;
        }
        return digitSum;
    }

}
