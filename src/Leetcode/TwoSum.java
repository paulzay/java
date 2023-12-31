package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.

    public static void main(String[]args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));//[0,1]
    }

    public static int[] twoSum(int[] nums, int target){
        // Brute force method
//        for(int i=0; i < nums.length -1; i++){
////            for(int j= i + 1; j < nums.length; j++){
////                if (nums[i] + nums[j] == target){
////                    return new int[]{i,j};
////                }
////            }
////        }
////        return new int[]{};

        // using hashmap
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            myMap.put(nums[i], i);
        }

        for(int j=0; j < nums.length; j++){
            int otherNum = target - nums[j];
            if(myMap.containsKey(otherNum) && myMap.get(otherNum) != j){
                return new int[]{j, myMap.get(otherNum)};
            }
        }
        return new int[]{};
    }
}
