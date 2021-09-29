package com.example.leetcode.string;

public class LengthOfLstWord {

    public static void main(String[] args) {
          LengthOfLstWord c = new LengthOfLstWord();
          System.out.println(c.lengthOfLastWord("   fly me   to   the moon  "));
    }


    public int lengthOfLastWord(String s) {
        if(s != null && s.length()>0) {
            String arr[] = s.trim().split(" ");
            return arr[arr.length-1].length();
        }
       return 0;
    }
}
