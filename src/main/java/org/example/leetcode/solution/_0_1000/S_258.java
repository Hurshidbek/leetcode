package org.example.leetcode.solution._0_1000;

class S_258 {
    public static void main(String[] args) {
        var solution = new S_258();

        solution.addDigits(1);
    }

    public int addDigits(int num) {
        if (num <= 9)
            return num;
        else if (num % 9 == 0)
            return 9;
        else
            return num % 9;
    }
}
