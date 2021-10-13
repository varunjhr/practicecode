package com.example.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingRule {
    public static void main(String[] args) {

      MatchingRule matchingRule = new MatchingRule();
      //System.out.print(matchingRule.countMatches());
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String , Integer> map = new HashMap<>();
        map.put("type",1);
        map.put("color",2);
        map.put("name",3);
        map.put("name",3);
        int ruleKeyIndex = map.get(ruleKey);

       int count = 0;
       for(int i = 0;i<items.size();i++){
         List<String> childList = new ArrayList<>();
         childList.addAll(items.get(i));
         for(int j = 0;j<childList.size();j++){
             if(childList.get(j).equalsIgnoreCase(ruleValue) && j == ruleKeyIndex) {
                count++;
             }
         }
       }

         return count;
    }

}
