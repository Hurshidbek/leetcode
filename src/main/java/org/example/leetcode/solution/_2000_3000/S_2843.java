package org.example.leetcode.solution._2000_3000;

class S_2843 {
    public static void main(String[] args) {
        var solution = new S_2843();

        solution.countSymmetricIntegers(1200, 1230);
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
        int n = s.length();
        if (n % 2 == 1) return false;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n / 2; i++) {
            leftSum += s.charAt(i) - '0';
            rightSum += s.charAt(n - i - 1) - '0';
        }
        return leftSum == rightSum;
    }
}