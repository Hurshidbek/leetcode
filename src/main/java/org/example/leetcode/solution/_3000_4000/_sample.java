package org.example.leetcode.solution._3000_4000;

import org.example.leetcode.solution.dictionaries.TestCase;
import org.example.leetcode.solution.dictionaries.Utils;

import java.util.List;

public class _sample {
    public static void main(String[] args) {

        List<TestCase> testCases = List.of(
                new TestCase("expected_result", "param1", "param2")
        );

        Utils.executeMethod("method_name", testCases);

    }

    public String method_name(String incoming_param1, String incoming_param2) {
//        logic here
        return "expected_result";
    }
}