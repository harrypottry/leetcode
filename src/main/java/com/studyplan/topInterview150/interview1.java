package com.studyplan.topInterview150;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * <a href="https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview1 {


//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = m; i< nums1.length; i++) {
////            nums1[i] = nums2[i-n-1];
////            for (int j = 0;j < nums2.length;j++) {
////                nums1[i] = nums2[j];
////            }
//            // m ---> 0 1 2 （3 4 5）<- i
//            // n ---> 3个
//            // ???? 0 1 2
//            // m-n 0 1 2
//            nums1[i] = nums2[i-n];
//        }
//        System.out.println(Arrays.toString(nums1));
//    }

    public static void main(String[] args) {
        // tests passed
//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int[] nums2 = new int[]{2,5,6};
//        merge(nums1, 3, nums2, 3);

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, nums2.length);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
       for (int i = 0;i<n;i++) {
           nums1[m+i] = nums2[i];
       }
        System.out.println(Arrays.toString(nums1));
    }
}
