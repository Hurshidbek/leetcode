package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.ListNode;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class S_2807 {

    public static void main(String[] args) {
        var solution = new S_2807();

        ListNode request = ListNode.generateRequest(List.of(18, 6, 10, 3));
        ListNode.printNode(request);

        ListNode response = solution.insertGreatestCommonDivisors(request);
        ListNode.printNode(response);

    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dump = head;
        while (dump.next != null){
            ListNode temp = new ListNode(Utils.gcd(dump.val, dump.next.val));
            temp.next = dump.next;
            dump.next = temp;
            dump = temp.next;
        }
        return head;
    }

}
