package com.honva.maxTime;

/**
 * Description 最大时间
 *
 * @Author honva
 * @Date 2020/5/3
 **/
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0};
//        int[] nums = new int[]{1,2,3,4};
        System.out.println(algorithm(nums));
    }
    public static String algorithm(int[] A){
        int max = -1;
        for (int i= 0;i<4;i++){
            for (int j=0;j<4;j++){
                if(j!=i){
                    for (int k = 0;k<4;k++){
                        if(k!=j && k!=i){
                            int l = 6 - j - k - i;
                            int hours = A[i]*10 + A[j];
                            int mins = A[k]*10+A[l];
                            if(hours<24 && mins<60){
                                max = Math.max(max,hours*60+mins);
                            }
                        }
                    }
                }
            }
        }
        return max>=0?String.format("%02d:%02d",max/60,max%60):"";
    }
}

