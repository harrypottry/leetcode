package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author harry
 * @date 2023年11月04日 19:22
 * <a href="https://leetcode.cn/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview5 {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        Arrays.sort(nums);
        return nums[n/2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3};
        int i = majorityElement(nums);
        System.out.println(i);
        // 小Tips
        // 除法运算
        // /  5/3  --> 1  除数
//        System.out.println(5/3);
        // %  5%3  --> 2  余数
//        System.out.println(5%3);
    }
}
