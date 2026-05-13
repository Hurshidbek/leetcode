package org.example.leetcode.solution.qr.parse;

import java.util.List;

public class Printer {

    public static void print(List<TLV> tlvs, int indent) {
        for (TLV tlv : tlvs) {
            System.out.println(" ".repeat(indent)
                + tlv.tag + " [" + tlv.length + "] = " + tlv.value);

            if (tlv.hasChildren()) {
                print(tlv.children, indent + 2);
            }
        }
    }
}
