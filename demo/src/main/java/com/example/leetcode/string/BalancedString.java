package com.example.leetcode.string;

public class BalancedString {
    public static void main(String[] args) {
        BalancedString balancedString = new BalancedString();
        System.out.print(balancedString.balancedStringSplit("RLRRRLLRLL"));

    }

    public int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('R' == s.charAt(i)) count--;
            if ('L' == s.charAt(i)) count++;
            if(count == 0) result++;
        }
        return result;
    }
}
