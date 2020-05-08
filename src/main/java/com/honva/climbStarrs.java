package com.honva;

/**
 * Description 爬楼梯
 * @Author honva
 * @Date 2020/5/8
 **/
public class climbStarrs {
    public static void main(String[] args) {
//        System.out.println(solution(3));
        System.out.println(solution2(3));
    }
    public static int solution(int n){
        double sqrt5 = Math.sqrt(5);
        double fib =Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        int result = (int) (fib/sqrt5);
        return result;
    }
    public static int solution2(int n){
        int [] ints = new int[n+1];
        ints[0]=1;
        ints[1] = 1;
        if(n<2) return ints[1];
        for (int i = 2; i <= n; i++) {
            ints[i] = ints[i-1]+ints[i-2];
        }
        return ints[n];
    }
}
