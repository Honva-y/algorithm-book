package com.honva.string;

import java.util.HashMap;

/**
 * Description 无重复字符串大小，滑动窗口
 * @Author honva
 * @Date 2020/5/4
 **/
public class Solution {
    public static void main(String[] args) {
        System.out.println(method("abcabcbb"));
    }
    public static Integer method(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){//包含
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
