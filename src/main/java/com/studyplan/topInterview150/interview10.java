package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月07日 19:46
 * <a href="https://leetcode.cn/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview10 {
    public static int jump(int[] nums) {
        int step =0;
        int max = 0;
        int end = 0;
        for (int i=0;i<nums.length - 1; i++) {
            max = Math.max(i+nums[i], max);
            if (i == end) {
                end = max;
                step++;
            }
        }
        return step;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int jump = jump(nums);
        System.out.println(jump);
    }
}
