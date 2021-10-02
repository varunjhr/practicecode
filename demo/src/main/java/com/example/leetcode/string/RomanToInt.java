package com.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            if (i < s.length() - 1)
                if (romanMap.get(String.valueOf(s.charAt(i))) >= romanMap.get(String.valueOf(s.charAt(i + 1)))) {
                    result = result + romanMap.get(String.valueOf(s.charAt(i)));
                } else result = result - romanMap.get(String.valueOf(s.charAt(i)));
            else result = result + romanMap.get(String.valueOf(s.charAt(i)));
        return result;
    }
}
