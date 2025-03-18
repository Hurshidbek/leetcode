package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.ListNode;

import java.util.List;

public class S_24 {
    public static void main(String[] args) {
        S_24 solution = new S_24();

        solution.swapPairs(ListNode.generateRequest(List.of(1)));
        solution.swapPairs(ListNode.generateRequest(List.of(1, 2, 3, 4)));
        solution.swapPairs(ListNode.generateRequest(List.of(1, 2, 3, 4, 5)));
    }

    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        while (head != null && head.next != null) {
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;

            dummy.next = temp;
            dummy = temp.next;

            head = head.next;
        }

        return res.next;
    }


}
