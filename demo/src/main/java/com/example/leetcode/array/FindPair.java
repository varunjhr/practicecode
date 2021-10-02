package com.example.leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class FindPair {

    public static void main(String[] args) {

        FindPair findPair = new FindPair();

        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(findPair.twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            temp = target - nums[i];
            if (list.contains(temp) && (list.indexOf(temp) != i)) {
                result[0] = i;
                result[1] = list.indexOf(temp);
                break;
            }
        }
        return result;
    }
}
