package com.example.demo;

import java.util.*;

public class hackerrank {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        int[] arr = {2,3,6,7,9,0};

        int sum = Arrays.stream(arr).reduce(0,(left, right) -> left+right);
        System.out.println(sum);

        hackerrank hackerrank = new hackerrank();
        hackerrank.letterCombinations("23");
    }
    public List<String> letterCombinations(String digits) {

        Map<Character,String> integerStringMap = new HashMap<>();
        integerStringMap.put('2',"abc");
        integerStringMap.put('3',"def");
        integerStringMap.put('4',"ghi");
        integerStringMap.put('5',"jkl");
        integerStringMap.put('6',"mno");
        integerStringMap.put('7',"pqrs");
        integerStringMap.put('8',"tuv");
        integerStringMap.put('9',"wxyz");

         List<String> stringList = new ArrayList<>();

         int[] c = {'4','7'};

        for(int i = 0;i<digits.length()-1;i++){
          //  System.out.println(digits.charAt(i));
            String val = integerStringMap.get(digits.charAt(i));

            for(int j = 0;j<val.length();j++) {
                for (int k = 0; k < integerStringMap.get(digits.charAt(i + 1)).length(); k++) {
                    String concatString = val.charAt(j) +
                            Character.toString(integerStringMap.get(digits.charAt(i + 1)).charAt(k));
                    System.out.println(concatString);
                    stringList.add(concatString);
                }
            }
        }
        System.out.println(stringList);
        return stringList;
    }
}
