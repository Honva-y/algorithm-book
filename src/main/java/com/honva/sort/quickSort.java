package com.honva.sort;

/**
 * Description 经典快排，和随机数快排
 * @Author honva
 * @Date 2020/5/5
 **/
public class quickSort {
    public static void main(String[] args) {
        int[] nums ={7,5,4,6,8};
        int index = (int)(Math.random() * 5 );
        swap(nums,index);
        solution(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void swap(int[] nums, int index) {
        int tmp = nums[0];
        nums[0] = nums[index];
        nums[index] = tmp;
    }

    public static void solution(int [] nums,int left,int right) {
        if (left < right) {
            int stardNum = nums[left];
            int l = left;
            int r = right;
            while (l < r) {
                // 判断是否相等
                while (stardNum <= nums[r] &&  l<r) r--;
                if (l < r) nums[l++] = nums[r];
                // 不需要相等条件
                while (stardNum > nums[l] &&  l<r) l++;
                if (l < r) nums[r--] = nums[l];
            }
            nums[l] = stardNum;
            solution(nums, left, r - 1);
            solution(nums, r + 1, right);
        }
    }
}
