package com.honva.stockTrading;

/**
 * Description 股票买卖
 * @Author honva
 * @Date 2020/5/4
 **/
public class Solution {
    public static void main(String[] args) {
        int[] params = {7,6,4,3,1};
        System.out.println(method1(params));
    }

    public static Integer method(int[] prices){
        int max = 0;
        for (int i = 0; i < prices.length; ++i) {
            int buyPrice = prices[i];
            for (int j = i; j < prices.length; j++) {
                int tmp = prices[j] - buyPrice;
                if(buyPrice<prices[j] && max<tmp){
                    max = tmp;
                }
            }
        }
        return max;
    }
    public static Integer method1(int[] prices){
        int maxResult = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price - min > maxResult) {
                maxResult = price - min;
            }
        }
        return maxResult;
    }
    public static Integer method2(int[] prices){
        int maxResult = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price - min > maxResult) {
                maxResult = price - min;
            }
        }
        return maxResult;
    }
}
