package org.example.leetcode.solution._1000_2000;

import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.*;

public class S_1110 {
    public static void main(String[] args) {

        var question = new S_1110();

        System.out.println(TreeNode.toString(question.delNodes(TreeNode.generateTreeNode(List.of(1, 2, 3, 4, 5, 6, 7)), new int[]{3, 5})));
    }

    Set<Integer> delete;
    List<TreeNode> res;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        delete = new HashSet<>();
        for (int i : to_delete) {
            delete.add(i);
        }

        res = new LinkedList<>();
        if (!dfs(root, delete.contains(root.val))) res.add(root);

        return res;
    }

    public boolean dfs(TreeNode node, boolean parent) {
        boolean child = false;
        if (delete.contains(node.val)) {
            child = true;
        }

        if (node.left != null && dfs(node.left, child)) {
            node.left = null;
        }
        if (node.right != null && dfs(node.right, child)) {
            node.right = null;
        }

        if (parent && !child){
            this.add(res, node);
        }

        return delete.contains(node.val);
    }

    public void add(Collection<TreeNode> list, TreeNode node) {
        if (node != null) {
            list.add(node);
        }
    }
}