package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.ListNode;

import java.util.List;
import java.util.Stack;

public class S_25 {
    public static void main(String[] args) {
        S_25 solution = new S_25();

        solution.reverseKGroup(solution.geneerateRequest(List.of(1, 2, 3, 4, 5)), 2);
        solution.reverseKGroup(solution.geneerateRequest(List.of(1, 2)), 2);
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = kthNode(groupPrev, k);
            if (kth == null) {
                break;
            }

            ListNode prev = kth.next;
            ListNode cur = groupPrev.next;

            ListNode groupNext = kth.next;
            while (cur != groupNext) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }

            // groupPrev points to the new head of reverse linked-list which is the kth node
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        ListNode print = dummy.next;
        while (print != null){
            System.out.print(print.val + " -> ");
            print = print.next;
        }
        System.out.println("!");
        return dummy.next;
    }

    public ListNode kthNode(ListNode cur, int k) {
        while (cur != null && k > 0) {
            cur = cur.next;
            k--;
        }
        return cur;
    }


    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode res = new ListNode();
        ListNode temp = res;
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        while (head != null) {
            if (count == k) {
                while (stack.size() > 0) {
                    temp.next = new ListNode(stack.pop());
                    temp = temp.next;
                    count--;
                }
            }

            stack.add(head.val);
            count++;
            head = head.next;
        }

        if (stack.size() == k){
            while (stack.size() > 0) {
                temp.next = new ListNode(stack.pop());
                temp = temp.next;
            }
        }
        else {
            for(int i: stack) {
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        }

        return res.next;
    }

    public ListNode geneerateRequest(List<Integer> list) {
        ListNode head = new ListNode();
        ListNode node = head;
        for (int i : list) {
            node.next = new ListNode(i);
            node = node.next;
        }
        return head.next;
    }

}
