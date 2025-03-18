package org.example.leetcode.solution._3000_4000;

import java.util.ArrayList;
import java.util.List;

class S_3211 {
    public static void main(String[] args) {
        var solution = new S_3211();

        int a = 14;
        String bsa = Integer.toBinaryString(a);
        int b = a >> 1;
        String bsb = Integer.toBinaryString(b);
        int c = a & b;
        String bsc = Integer.toBinaryString(c);

        System.out.println(bsa);
        System.out.println("0".repeat(bsa.length() - bsb.length()) + bsb);
        System.out.println("0".repeat(bsa.length() - bsc.length()) + bsc);

        System.out.println(solution.validStrings(3));
        System.out.println(solution.validStrings(1));
        System.out.println(solution.validStrings(4));


        solution.generate("", 3);
        System.out.println("list: " + solution.list);
    }


    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        int limitHigh = 1 << n, startLow = Math.max(0, 1 << (n - 2));

        for (int i = startLow; i < limitHigh; i++) {
            String binary = Integer.toBinaryString(i);
            binary = "0".repeat(n - binary.length()) + binary;
            if (binary.indexOf("00") < 0) {
                result.add(binary);
            }
        }
        return result;
    }

    List<String> list = new ArrayList<>();

    private void generate(String current, int n) {
        if (current.length() == n) {
            list.add(current);
            return;
        }
        generate(current + "1", n);
        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generate(current + "0", n);
        }
    }


}


