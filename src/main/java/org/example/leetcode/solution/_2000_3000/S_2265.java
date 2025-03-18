package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TreeNode;

class S_2265 {
    public static void main(String[] args) {
        var solution = new S_2265();

        solution.averageOfSubtree(null);
    }

    public int averageOfSubtree(TreeNode root) {
        bfs(root);
        return count;
    }

    int count = 0;
    public int[] bfs(TreeNode root) {
        if (root == null) return new int[]{0,0};
        int[] result = new int[2];

        int[] temp = bfs(root.left);
        result[0]+=temp[0];
        result[1]+=temp[2];

        temp = bfs(root.right);
        result[0]+=temp[0];
        result[1]+=temp[2];

        if (result[1] > 0 && result[0]/result[1] == root.val) count++;

        return result;
    }

}