package org.example.leetcode.solution.dictionaries;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static ListNode generateRequest(List<Integer> list) {
        ListNode head = new ListNode();
        ListNode node = head;
        for (int i : list) {
            node.next = new ListNode(i);
            node = node.next;
        }
        return head.next;
    }

    public static void printNode(ListNode root) {
        if (root == null) {
            System.out.println();
            return;
        }
        System.out.print(root.val + " ");
        printNode(root.next);
    }

    public static String toString(ListNode root) {
        StringBuilder sb = new StringBuilder();
        toStringHelper(root, sb);
        return sb.toString();
    }
    public static void toStringHelper(ListNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(".-");
            return;
        }
        sb.append(root.val).append("-");

        toStringHelper(root.next, sb);
    }
}