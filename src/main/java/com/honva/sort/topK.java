package com.honva.sort;

/**
 * Description 找出第K大的数
 *
 * @Author honva
 * @Date 2020/5/10
 **/
public class topK {
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 2, 8, 6, 7, 9};
        System.out.println(topK(nums, 2));
    }

    public static int topK(int[] nums, int k) {
        int count = 0;
        maxDumpMake(nums);

        int size = nums.length-1;
        while (size>0){
            swap(nums, 0, size);
            count++;
            if(count==k) break;
            size--;
            heapify(nums,size,0);
        }
        return nums[nums.length-k];
    }

    public static void heapify(int[] nums,int size, int parrrentIndex) {
        int left = parrrentIndex * 2 + 1;
        int right = parrrentIndex * 2 + 2;
        int lagestIndex;
        while (left<size) {
            if (nums[left] >= nums[right] && right<=size) {
                lagestIndex = left;
            } else {
                lagestIndex = right;
            }
            if (nums[lagestIndex] > nums[parrrentIndex]) {
                swap(nums, lagestIndex, parrrentIndex);
                left = lagestIndex * 2 + 1;
                right = lagestIndex * 2 + 2;
                parrrentIndex = lagestIndex;
            }
        }
    }

    public static void maxDumpMake(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currentIndex = i;
            int parentIndex = (currentIndex - 1) / 2;
            while (nums[currentIndex] > nums[parentIndex]) {
                swap(nums, currentIndex, parentIndex);
                currentIndex = parentIndex;
                parentIndex = (currentIndex - 1) / 2;
            }
        }
    }

    static void swap(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}
