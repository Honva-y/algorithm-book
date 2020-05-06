package com.honva.towNumAdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * @Author honva
 * @Date 2020/5/1
 **/
public class Solution {
    public static void main(String[] args) {
        int[] resultInt = towSumList(new int[]{3, 3}, 6);
    }

    static int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // 将大于target数去掉，复杂度o(n)
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i : nums) {
            int otherNum = target - nums[i];
            if (map.containsKey(otherNum)) {
                return new int[]{i, map.get(otherNum)};
            }
        }
        throw new IllegalArgumentException("no such num");
    }
    static int[] towSumList(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i< nums.length; i++) {
//            if(map.containsKey(target - nums[i])) {
//                return new int[] {map.get(target-nums[i]),i};
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0; i<len; i++) {
            map.put(nums[i], i);
        }
        for(int i=0; i<len; i++) {
            int key = target - nums[i];
            if(map.containsKey(key) && map.get(key) != i) {
                return new int[]{i, map.get(key)};
            }
        }
        return null;
    }
}
