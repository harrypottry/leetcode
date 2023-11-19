package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author harry
 * @date 2023年11月07日 20:16
 * <a href="https://leetcode.cn/problems/h-index/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview11 {

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h =0;
        for (int i=citations.length-1;i>=0;i--){
            if (citations[i]>h) {
                h++;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int jump = hIndex(nums);
        System.out.println(jump);
    }
}
