package com.example.leetcode.string;

public class UniqueString {

    private int firstUniqueStringIndex(String s){
        char[] charArr = s.toCharArray();
        int index = -1;
        for(int i = 0;i<charArr.length;i++) {
            if (s.indexOf(s.charAt(i), i + 1) < 0)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        UniqueString uniqueString = new UniqueString();
        System.out.println(uniqueString.firstUniqueStringIndex("nasnsa"));
    }
}
