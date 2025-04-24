package org.example.leetcode.solution.dictionaries;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class TestCase {

    Object result;

    List<Object> params;

    public TestCase(Object param) {
        this.params = Arrays.asList(param);
    }

    public TestCase(Object result, Object... params) {
        this.result = result;
        this.params = Arrays.asList(params);

    }
}
