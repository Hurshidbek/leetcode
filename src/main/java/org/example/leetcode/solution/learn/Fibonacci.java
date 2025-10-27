package org.example.leetcode.solution.learn;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int fibonacci = fibonacci(i);
            System.out.println(i + ": " + fibonacci);
        }
    }


    public static int fibonacci(int i) {
        return i < 3 ? 1 : fibonacci(i-1) + fibonacci(i-2);
    }
}
