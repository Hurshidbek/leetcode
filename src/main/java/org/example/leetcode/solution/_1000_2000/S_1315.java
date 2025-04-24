package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

public class S_1315 {
    public static void main(String[] args) {
        var solution = new S_1315();

        solution.sumEvenGrandparent(null);
    }

    public int sumEvenGrandparent(TreeNode root) {
        bfs(root, -1,-1);
        return sum;
    }
    int sum = 0;
    public void bfs(TreeNode root, int prev, int grandPa) {
        if (root==null)return;
        bfs(root.left, root.val, prev);
        bfs(root.right, root.val, prev);
        if (grandPa%2==0) sum+= root.val;
    }


}