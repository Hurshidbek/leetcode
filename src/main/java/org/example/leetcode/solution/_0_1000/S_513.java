package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.TreeNode;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.*;

public class S_513 {
    public static void main(String[] args) {
        S_513 solution = new S_513();

        Utils.print(solution.findBottomLeftValue(TreeNode.generateTreeNode(List.of(2, 1, 3))));
    }

    int left;
    int rowPrev;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;
        left = 0;
        rowPrev = 0;

        leftmost(root, 1);

        return left;
    }

    public void leftmost(TreeNode root, int row) {
        if (root == null) return;

        if (row > rowPrev) {
            left = root.val;
            rowPrev = row;
        }

        leftmost(root.left, row + 1);
        leftmost(root.right, row + 1);
    }

    public int findBottomLeftValue1(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.right != null) queue.add(node.right);
            if (node.left != null) queue.add(node.left);
            res = node.val;
        }
        return res;
    }
}