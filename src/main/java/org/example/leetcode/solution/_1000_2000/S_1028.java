package org.example.leetcode.solution._1000_2000;


import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.*;

class S_1028 {
    public static void main(String[] args) {
        var solution = new S_1028();

        System.out.println("Preorder traversal: ");
        solution.printPreorder(solution.recoverFromPreorder("1-2--3--4-5--6--7"));
    }

    public void printPreorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    public TreeNode recoverFromPreorder(String traversal) {
        idx = 0;
        this.traversal = traversal;

        return this.recursive(0);
    }
    int idx;
    String traversal;
    private TreeNode recursive(int depth) {
        if (idx == traversal.length()) {
            return null;
        }

        for (int i = idx; i < idx + depth; i++) {
            if (traversal.charAt(i) != '-') {
                return null;
            }
        }

        idx += depth;
        int val = 0;
        while (idx < traversal.length() && traversal.charAt(idx) != '-') {
            val = val * 10 + (traversal.charAt(idx) - '0');
            idx++;
        }

        TreeNode node = new TreeNode(val);
        node.left = recursive(depth + 1);
        node.right = recursive(depth + 1);

        return node;
    }

    public TreeNode recoverFromPreorder1(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0, n = traversal.length();

        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int value = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                value = value * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(value);

            while (stack.size() > depth) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                if (stack.peek().left == null)
                    stack.peek().left = node;
                else
                    stack.peek().right = node;
            }
            stack.push(node);
        }
        while (stack.size() > 1) {
            stack.pop();
        }
        return stack.peek();
    }

}