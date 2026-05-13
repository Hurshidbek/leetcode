
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_3731 {
    public static void main(String[] args) {
        var solution = new S_3731();

        Utils.print(solution.findMissingElements(new int[]{1, 4, 2, 5}));
        Utils.print(solution.findMissingElements(new int[]{5, 1}));
    }

    public List<Integer> findMissingElements(int[] nums) {

        int min = 100, max = 0;
        int[] arr = new int[101];
        List<Integer> res = new ArrayList<>();

        for (int i : nums) {
            if (min > i) min = i;
            if (max < i) max = i;
            arr[i]++;
        }

        for (int i = min + 1; i < max; i++) {
            if (arr[i] == 0) res.add(i);
        }

        return res;
    }
}