package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.Arrays;
import java.util.List;

public class S_2415 {
    public static void main(String[] args) {

        var question = new S_2415();

        TreeNode treeNode = TreeNode.generateTreeNode(List.of(2, 3, 5, 8, 13, 21, 34));

        TreeNode solution = question.reverseOddLevels(treeNode);

        TreeNode.printTreeNode(solution);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right, 1);
        return root;
    }

    public void dfs(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;

        if (level % 2 == 1) {
            left.val += right.val;
            right.val = left.val - right.val;
            left.val -= right.val;
        }

        dfs(left.left, right.right, level + 1);
        dfs(left.right, right.left, level + 1);
    }
}