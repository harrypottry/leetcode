package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月06日 10:02
 * <a href="https://leetcode.cn/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview9 {

//    public static boolean canJump(int[] nums) {
//        if(nums.length == 1) {
//            return true;
//        }
//        for(int i=0;i<nums.length;i++) {
//            if(nums[i] == 0 && !check(nums, i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean check(int[] nums, int end) {
//        for(int j=end-1;j>=0;j--) {
//            if(nums[j] > (end - j) || (j+nums[j]) >= nums.length-1) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        boolean b = canJump(nums);
        System.out.println(b);
    }

    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int i=0;i<nums.length;i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(nums[i] + i,reach);
        }
        return true;
    }

}
