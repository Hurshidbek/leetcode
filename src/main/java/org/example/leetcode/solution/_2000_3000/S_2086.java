package org.example.leetcode.solution._2000_3000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class S_2086 {

    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase(2, "H..H"),
                new TestCase(1, "H.H"),
                new TestCase(1, ".H.H."),
                new TestCase(2, ".HH."),
                new TestCase(1, "...H..."),
                new TestCase(-1, ".HHH."),
                new TestCase(-1, ".HHHH.")
        );

        Utils.executeMethod("minimumBuckets", testCases);

    }

    public int minimumBuckets(String hamsters) {

        char[] carr = hamsters.toCharArray();
        int count = 0, len = hamsters.length();

        for (int i = 0; i < len; i++) {
            if (carr[i] != 'H') continue;
            if (i < len - 1 && carr[i + 1] == '.') {
                carr[i + 1] = 'F';
                count++;
                i += 2;
            } else if (i > 0 && carr[i - 1] == '.') {
                count++;
            } else {
                return -1;
            }
        }

        return count;
    }

    public int minimumBuckets1(String hamsters) {

        char[] arr = hamsters.toCharArray();
        int n = arr.length;
        int buckets = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 'H') {

                if (i > 0 && arr[i - 1] == 'B') {
                    continue;
                }

                if (i + 1 < n && arr[i + 1] == '.') {
                    arr[i + 1] = 'B';
                    buckets++;
                } else if (i > 0 && arr[i - 1] == '.') {
                    arr[i - 1] = 'B';
                    buckets++;
                } else {
                    return -1;
                }
            }
        }

        return buckets;
    }
}