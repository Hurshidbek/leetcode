package org.example.leetcode.solution._0_1000;

import org.example.leetcode.solution.dictionaries.ListNode;
import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S_654 {
    public static void main(String[] args) {

        var solution = new S_654();

        TreeNode.printTreeNode(solution.constructMaximumBinaryTree(new int[]{5, 0, 3, 1, 2, 4, 6, 0, 5}));
//        TreeNode.printTreeNode(solution.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) { // with recursion
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;

        int maxInd = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[maxInd]) {
                maxInd = i;
            }
        }

        var node = new TreeNode(nums[maxInd]);

        node.left = helper(nums, left, maxInd - 1);
        node.right = helper(nums, maxInd + 1, right);

        return node;
    }

    public TreeNode constructMaximumBinaryTree2(int[] nums) { // with stack
        var stack = new Stack<TreeNode>();
        for (int i : nums) {
            var node = new TreeNode(i);
            while (stack.size() > 0 && stack.peek().val < i) {
                node.left = stack.pop();
            }
            if (stack.size() > 0) {
                stack.peek().right = node;
            }
            stack.push(node);
        }
        return stack.get(0);
    }

}