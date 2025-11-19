package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S_703 {
    public static void main(String[] args) {

        var requestCons = List.of(
                new KthLargest(3, new int[]{4, 5, 8, 2}),
                new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3})
        );

        var requests = List.of(
                List.of(3, 5, 10, 9, 4),
                List.of(2, 10, 9, 9)
        );


        for (int i = 0; i < requestCons.size(); i++) {
            var list = requests.get(0);

            List<Integer> res = new ArrayList<>();

            var dto = requestCons.get(i);

            for (int num : list) {
                res.add(dto.add(num));
            }

            System.out.println(res);
        }

    }

    static class KthLargest {

        ListNode node = new ListNode();
        int size = 0;

        public KthLargest(int k, int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (size < k || node.val < i){

                }
            }
        }

        public int add(int val) {

            return node.val;
        }
    }

}