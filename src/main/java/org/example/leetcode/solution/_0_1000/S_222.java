package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.TreeNode;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_222 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(6, TreeNode.generateTreeNode(List.of(1, 2, 3, 4, 5, 6)))
        );

        Utils.executeMethod("countNodes", testCases);

    }

    public int countNodes(TreeNode root) {
        dfs(root);
        return count;
    }

    int count = 0;

    public void dfs(TreeNode root) {
        if (root == null) return;
        count++;
        dfs(root.left);
        dfs(root.right);
        return;
    }
}