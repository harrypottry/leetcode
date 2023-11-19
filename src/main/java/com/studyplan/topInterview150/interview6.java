package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author harry
 * @date 2023年11月04日 19:54
 * <a href="https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview6 {

//    /**
//     * 时间复杂度 O（n），跑满量int[] 性能大幅度下降
//     * @param nums
//     * @param k
//     */
//    public static void rotate(int[] nums, int k) {
//        for (int i =0;i<k;i++) {
//           int endNum = nums[nums.length-1];
//           for (int j=nums.length-1;j>0;j--) {
//               nums[j] = nums[j-1];
//           }
//            nums[0] = endNum;
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0 , nums.length -1);
        reverse(nums, 0 , k-1);
        reverse(nums, k , nums.length -1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        // 1 2 3 4 5 6 7
        // 1 2 3 4 5 6 6
        // 1 2 3 4 5 5 6
        // 1 2 3 4 4 5 6
        // 1 2 3 3 4 5 6
        // 1 2 2 3 4 5 6
        // 1 1 2 3 4 5 6
        // 7 1 2 3 4 5 6
        // j-> 1 2 3 4 5 6
        rotate(nums,3);

        //tips
        //start += 1;和start++区别:
        //
        //start++是后置递增操作符，它会先返回start的当前值，然后再将start的值增加1。
        //++start是前置递增操作符，它会先将start的值增加1，然后返回新的start值。
        //start += 1;是一个赋值操作，它会先将start的值增加1，然后返回新的start值。
        //所以，如果你只是想将start的值增加1，并不在意表达式的返回值，那么start += 1;和start++;是等价的。

//        System.out.println(3%7);
//        System.out.println(4%7);
    }
}
