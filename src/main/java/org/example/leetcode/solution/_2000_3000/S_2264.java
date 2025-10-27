package org.example.leetcode.solution._2000_3000;

public class S_2264 {
    public static void main(String[] args) {
        var solution = new S_2264();

//        System.out.println(solution.largestGoodInteger("42352338"));
//        System.out.println(solution.largestGoodInteger("2300019"));
//        System.out.println(solution.largestGoodInteger("6777133339"));
        System.out.println(solution.largestGoodInteger("101010"));
    }

    public String largestGoodInteger(String num) {
        String res = "";
        int i = 1, temp = -1;
        while (i < num.length() - 1) {
            if (num.charAt(i - 1) == num.charAt(i) && num.charAt(i) == num.charAt(i + 1)) {
                if (temp < num.charAt(i)) {
                    res = num.substring(i - 1, i + 2);
                    temp = num.charAt(i);
                }
                i += 3;
            } else {
                i++;
            }
        }
        return res;
    }
}