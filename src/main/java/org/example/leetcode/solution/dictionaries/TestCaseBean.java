package org.example.leetcode.solution.dictionaries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestCaseBean {

    Object result;

    Object testCase;

    Object testCasePart1;
    Object testCasePart2;
    Object testCasePart3;

    public TestCaseBean(Object testCase) {
        this.testCase = testCase;
    }

    public TestCaseBean(Object result, Object testCase) {
        this.result = result;
        this.testCase = testCase;
    }

    public TestCaseBean(Object result, Object testCasePart1, Object testCasePart2) {
        this.result = result;
        this.testCasePart1 = testCasePart1;
        this.testCasePart2 = testCasePart2;
    }

    public TestCaseBean(Object result, Object testCasePart1, Object testCasePart2, Object testCasePart3) {
        this.result = result;
        this.testCasePart1 = testCasePart1;
        this.testCasePart2 = testCasePart2;
        this.testCasePart3 = testCasePart3;
    }
}
