package org.example.leetcode.solution._2000_3000;

public class S_2843 {
    public static void main(String[] args) {
        var solution = new S_2843();

        System.out.println(solution.countSymmetricIntegers(1200, 1230));
    }

    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                res++;
            }
        }
        return res;
    }

    public boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        if (len % 2 == 1) return false;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < len / 2; i++) {
            leftSum += s.charAt(i) - '0';
            rightSum += s.charAt(len - i - 1) - '0';
        }
        return leftSum == rightSum;
    }
}