package com.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public static void main(String[] args) {
        ShuffleString shuffleString = new ShuffleString();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(shuffleString.restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        char[] ch1 = new char[s.length()];
        for (int i = 0; i< indices.length; i++) {
            ch1[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch1);
    }


}
