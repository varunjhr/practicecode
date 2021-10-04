package com.example.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JewelsAndStones {

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones("abcd", "AAEDEBCDDOABCBABCabcbbc"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        Map<String, Integer> stoneMap = new HashMap<>();
        for (int i = 0; i < stones.length(); i++)
            if (stoneMap.containsKey(String.valueOf(stones.charAt(i))))
                stoneMap.put(String.valueOf(stones.charAt(i)), stoneMap.get(String.valueOf(stones.charAt(i))) + 1);
            else stoneMap.put(String.valueOf(stones.charAt(i)), 1);

        Set<String> jewwlsSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewwlsSet.add(String.valueOf(jewels.charAt(i)));
        }
        stoneMap = stoneMap.entrySet().stream().
                filter(e -> jewwlsSet.contains(e.getKey())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : stoneMap.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}
