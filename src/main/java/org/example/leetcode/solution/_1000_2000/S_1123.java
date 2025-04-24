package org.example.leetcode.solution._1000_2000;

import com.sun.source.tree.Tree;
import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.List;

class S_1123 {
    public static void main(String[] args) {
        var solution = new S_1123();

        TreeNode.printTreeNode(
                solution.lcaDeepestLeaves(
                        TreeNode.generateTreeNode(
                                List.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4))));
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return null;
    }
}