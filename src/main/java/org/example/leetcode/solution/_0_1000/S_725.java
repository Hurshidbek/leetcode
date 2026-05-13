package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.ListNode;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.BitSet;
import java.util.List;

public class S_725 {
    public static void main(String[] args) {
        var question = new S_725();

        Utils.print(question.splitListToParts(ListNode.generateRequest(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 3));
        Utils.print(question.splitListToParts(ListNode.generateRequest(List.of(1, 2, 3)), 5));
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        double count = 0;
        ListNode tempCount = head;
        while (tempCount != null) {
            count++;
            tempCount = tempCount.next;
        }

        int index = 0;
        ListNode[] res = new ListNode[k];

        while (head != null) {
            double ceil = Math.ceil(count / k);

            ListNode node = new ListNode();
            ListNode temp = node;
            for (int i = 0; i < ceil; i++) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
                head = head.next;
            }

            res[index++] = node.next;
            count -= ceil;
            k--;
        }

        return res;
    }

}