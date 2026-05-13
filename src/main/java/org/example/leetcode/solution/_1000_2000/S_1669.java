package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.ListNode;

import java.util.Arrays;
import java.util.List;

public class S_1669 {
    public static void main(String[] args) {
        var question = new S_1669();

        ListNode.printNode(question.mergeInBetween(
                ListNode.generateRequest(List.of(0, 1, 2, 3, 4, 5, 6)),
                2, 5,
                ListNode.generateRequest(List.of(1000000, 1000001, 1000002, 1000003, 1000004))
        ));
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode start = null;
        ListNode end = list1;

        for (int i = 0; i < b; i++) {
            if (i == a - 1) {
                start = end;
            }
            end = end.next;
        }
        start.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end.next;
        end.next = null;

        return list1;
    }

    public ListNode mergeInBetween1(ListNode list1, int a, int b, ListNode list2) {

        ListNode prevA = null;
        ListNode afterB = null;
        ListNode temp = list1;
        int ind = 0;

        while (temp != null) {
            if (ind == a - 1) {
                prevA = temp;
            } else if (ind == b + 1) {
                afterB = temp;
                break;
            }
            temp = temp.next;
            ind++;
        }
        prevA.next = list2;

        temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = afterB;

        return list1;
    }
}