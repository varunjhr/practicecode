package com.example.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class finalValueAfterOperations {

    public static void main(String[] args) {
        String[] input = {"--X","X++","X++"};
        finalValueAfterOperations finalValueAfterOperations = new finalValueAfterOperations();
        System.out.println(finalValueAfterOperations.finalValueAfterOperations(input));
    }

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        Map<String, Integer> initializeMap = new HashMap<>();
        initializeMap.put("X++", 1);
        initializeMap.put("++X", 1);
        initializeMap.put("X--", -1);
        initializeMap.put("--X", -1);
        int i = 0;
        while (i < operations.length) {
            result += initializeMap.get(operations[i]);
            i++;
        }
        return result;
    }
}
