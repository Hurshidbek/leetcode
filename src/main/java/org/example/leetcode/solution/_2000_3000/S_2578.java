package org.example.leetcode.solution._2000_3000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S_2578 {
    public static void main(String[] args) {
        var solution = new S_2578();

        System.out.println(solution.splitNum(4325));
        System.out.println(solution.splitNum(687));
    }

    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();

        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }

        Collections.sort(list);
        int num1 = 0, num2 = 0;

        for (int i = 0; i < list.size(); i += 2) {
            num1 = num1 * 10 + list.get(i);
            if (i<list.size()-1)
                num2 = num2 * 10 + list.get(i + 1);
        }

        return num1 + num2;
    }
}