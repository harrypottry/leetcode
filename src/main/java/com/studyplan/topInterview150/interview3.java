package com.studyplan.topInterview150;

/**
 * @author mac
 * https://leetcode.cn/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
 */
public class interview2 {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right!= nums.length; right++){
            if (nums[right] != val){
               nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int i = removeElement(nums, 3);
        System.out.println(i);
    }
}
