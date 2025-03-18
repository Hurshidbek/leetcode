package org.example.leetcode.solution._1000_2000;


import org.example.leetcode.solution.dictionaries.BitSetUtil;
import org.example.leetcode.solution.dictionaries.TreeNode;

import java.util.*;

class S_1261 {
    public static void main(String[] args) {
        List<TreeNode> nodes = List.of(
                TreeNode.generateTreeNode(Arrays.asList(-1, null, -1)),
                TreeNode.generateTreeNode(Arrays.asList(-1, -1, -1, -1, -1))
        );

        var solution = new S_1261(nodes.get(0));
    }

    public S_1261(TreeNode root) {
        bfs(root, 0);
    }
    Set<Integer> set = new HashSet<>();
//    BitSet bitset = new BitSet();
    public void bfs(TreeNode root, int val) {
        if (root == null) return;
        set.add(val);
//        bitset.set(val);
//        BitSetUtil.add(bitset, val);
        bfs(root.left, 2 * val + 1);
        bfs(root.right, 2 * val + 2);
    }
    public boolean find(int target) {
        return set.contains(target);
//        return bitset.get(target);
//        return BitSetUtil.contains(bitset, target);
    }

}