package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.TreeNode;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_2236 {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase("expected_result", "param1", "param2")
        );

        Utils.executeMethod("method_name", testCases);

    }

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}