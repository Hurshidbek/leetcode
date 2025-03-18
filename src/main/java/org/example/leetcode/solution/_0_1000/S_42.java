package org.example.leetcode.solution._0_1000;

class S_42 {
    public static void main(String[] args) {
        var solution = new S_42();

    }

    public int trap(int[] h) {
        int l = 0, r = h.length - 1, min = 0, res = 0;
        while (l < r) {
            min = Math.max(min, Math.min(h[l], h[r]));
            if (h[l] <= h[r]) {
                res += min - h[l++];
            } else {
                res += min - h[r++];
            }
        }
        return res;
    }
}