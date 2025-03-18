package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

class S_1038 {
    public static void main(String[] args) {
        var solution = new S_1038();

        solution.bstToGst(null);
    }

    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return root;

        bstToGst(root.right);

        sum += root.val;
        root.val = sum;

        bstToGst(root.left);

        return root;
    }

}