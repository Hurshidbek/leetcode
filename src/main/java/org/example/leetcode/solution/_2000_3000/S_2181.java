package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.ListNode;

import java.util.List;

class S_2181 {
    public static void main(String[] args) {
        var solution = new S_2181();

        ListNode listNode = ListNode.generateRequest(List.of(0, 3, 1, 0, 4, 5, 2, 0));

        ListNode.printNode(solution.mergeNodes(listNode));
    }

    public ListNode mergeNodes(ListNode head) {
        int num = 0;
        ListNode res = new ListNode();
        ListNode temp = res;

        while (head != null) {
            if (head.val != 0){
                num += head.val;
            }
            else {
                if (num != 0){
                    temp.next = new ListNode(num);
                    temp = temp.next;
                }
                num = 0;
            }
            head = head.next;
        }

        return res.next;
    }
}