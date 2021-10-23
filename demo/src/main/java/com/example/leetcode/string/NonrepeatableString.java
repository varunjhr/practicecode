package com.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class NonrepeatableString {

    private int firstRepeatableCharIndex(String str) {
        int index = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                index = map.get(str.charAt(i));
                break;
            } else {
                map.put(str.charAt(i), str.indexOf(str.charAt(i)));
            }
        }
        return index;
    }

    public static void main(String[] args) {
        NonrepeatableString nonrepeatableString = new NonrepeatableString();
        System.out.println(nonrepeatableString.firstRepeatableCharIndex("erty8uioh"));
    }
}
