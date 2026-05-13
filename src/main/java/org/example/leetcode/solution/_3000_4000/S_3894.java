
package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.Utils;

public class S_3894 {
    public static void main(String[] args) {
        var solution = new S_3894();

        Utils.print(solution.trafficSignal(60));
    }

    public String trafficSignal(int timer) {
        if (timer == 0) return "Green";
        else if (timer == 30) return "Orange";
        else if (timer > 30 && timer <= 90) return "Red";
        return "Invalid";
    }
}