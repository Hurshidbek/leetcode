package org.example.leetcode.solution.qr.parse;

import java.util.List;

public class TLV {
    public final String tag;
    public final int length;
    public final String value;
    public final List<TLV> children;

    public TLV(String tag, int length, String value, List<TLV> children) {
        this.tag = tag;
        this.length = length;
        this.value = value;
        this.children = children;
    }

    public boolean hasChildren() {
        return children != null && !children.isEmpty();
    }
}
