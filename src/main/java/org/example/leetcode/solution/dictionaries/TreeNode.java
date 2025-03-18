package org.example.leetcode.solution.dictionaries;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, null, 2, 3, 4);
        TreeNode root = generateTreeNode(list);

        System.out.print("Pre-order: ");
        printTreeNode(root);
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode generateTreeNode(List<Integer> values) {
        if (values == null || values.isEmpty() || values.get(0) == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values.get(0));
        queue.add(root);
        int i = 1   ;

        while (!queue.isEmpty() && i < values.size()) {
            TreeNode curr = queue.poll();

            if (i < values.size() && values.get(i) != null) {
                curr.left = new TreeNode(values.get(i));
                queue.offer(curr.left);
            }
            i++;

            if (i < values.size() && values.get(i) != null) {
                curr.right = new TreeNode(values.get(i));
                queue.offer(curr.right);
            }
            i++;
        }

        return root;
    }

    // Print tree in pre-order (for debugging)
    public static void printTreeNode(TreeNode root) {
        if (root == null) {
            System.out.print("null-");
            return;
        }
        System.out.print(root.val + "-");
        printTreeNode(root.left);
        printTreeNode(root.right);
    }

}