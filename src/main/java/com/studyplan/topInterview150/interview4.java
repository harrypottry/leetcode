package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author mac
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview4 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
