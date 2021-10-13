package com.example.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingSentence {
    public static void main(String[] args) {
        SortingSentence sortingSentence = new SortingSentence();
        System.out.print(sortingSentence.sortSentence("Myself2 Me1 I4 and3"));

    }

    public String sortSentence(String s) {
        String[] aarStr = s.split(" ");
        StringBuilder x = new StringBuilder();
        Map<Integer, String> map = new TreeMap<>();
        Arrays.stream(aarStr).forEach(
                e -> map.put(Integer.parseInt(String.valueOf(e.charAt(e.length() - 1))),
                        e.substring(0, e.length() - 1))
        );
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            x.append(entry.getValue()).append(" ");
        }
        return x.toString().trim();
    }

}
