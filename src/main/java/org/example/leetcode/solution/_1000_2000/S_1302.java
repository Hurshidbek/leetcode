package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

public class S_1302 {
    public static void main(String[] args) {
        var solution = new S_1302();

        solution.averageOfSubtree(null);
    }

    public int averageOfSubtree(TreeNode root) {
        bfs(root, 1);
        return sumDeepest;
    }

    int sumDeepest = 0;
    int stepDeepest = 0;

    public void bfs(TreeNode root, int step) {
        if (root == null) return;

        bfs(root.left, step+1);
        bfs(root.right, step+1);

        if (stepDeepest < step) {
            stepDeepest = step;
            sumDeepest = root.val;
        } else if (stepDeepest == step) {
            sumDeepest += root.val;
        }
    }

}