package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author mac
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview3 {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
//                nums[index++] = nums[i];
                nums[index] = nums[i];
                index++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return index;
    }

    public static void main(String[] args) {
        //非严格递增 也是有序的  12234属于非严格递增数字序列
        //严格递增， 中间不能又相等
//        int[] nums = new int[]{1,2,2,1,3};
        int[] nums = new int[]{1,2,2,3,3};
        int i = removeDuplicates(nums);
        System.out.println(i);
//        int  i  = 0;
//        int m = i++;
//        int p = i;
//        System.out.println("");
//        System.out.println("");
//        int n = ++i;
//        int q = i;
//        System.out.println("");
//        System.out.println("");
//        System.out.println(n);
        // i++ 和 ++i
        // 相同点是都进行自增 ，也就是 i的值要 +1 ，如i=0，那么 无论i++或者++i ，经过运算后i的值就是1
        // 不同点在于接收的值不同，i++ 是先赋值再自增再+1，因此 i++的值不变，比如 i=0，那么 i++的值也是0
        //                     ++i 是先+1再自增，因此 ++i的值改变，比如 i=0，那么++i的值变为1
    }
}
