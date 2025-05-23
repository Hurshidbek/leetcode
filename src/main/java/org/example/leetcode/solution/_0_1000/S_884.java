package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.*;

public class S_884 {
    public static void main(String[] args) {

        var solution = new S_884();

        System.out.println(Arrays.toString(solution.uncommonFromSentences("this apple is sweet", "this apple is sout")));

    }

    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : s1.split(" ")) map.merge(s, 1, Integer::sum);
        for (String s : s2.split(" ")) map.merge(s, 1, Integer::sum);

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }

        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}