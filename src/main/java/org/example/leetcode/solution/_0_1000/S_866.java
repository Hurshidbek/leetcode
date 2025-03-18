package org.example.leetcode.solution._0_1000;

public class S_866 {
    public static void main(String[] args) {
        S_866 solution = new S_866();

        System.out.println(solution.primePalindrome(1));
        System.out.println(solution.primePalindrome(2));
        System.out.println(solution.primePalindrome(6));
        System.out.println(solution.primePalindrome(8));
        System.out.println(solution.primePalindrome(13));
        System.out.println(solution.primePalindrome(9989900));
        System.out.println(solution.primePalindrome(61023998));
    }

    public int primePalindrome(int n) {
        if (n <= 2) return 2;
        if (n == 3) return 3;
        if (n <= 5) return 5;

        int temp = 5;
        while (true) {
            if (temp + 2 < n) {
                temp += 6;
                continue;
            }

            if (temp >= n && isPalindrome(temp) && isPrime(temp)) {
                return temp;
            }
            if (isPalindrome(temp + 2) && isPrime(temp + 2)) {
                return temp + 2;
            }
            temp += 6;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    private boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }


}