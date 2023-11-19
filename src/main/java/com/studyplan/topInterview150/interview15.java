package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月11日 14:38
 */
public class interview15 {

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
        }
        return ret;
    }

    public static void main(String[] args) {
        // 1 3 2 2 1
        int[] scores = new int[]{1,3,2,2,1};
        int result = candy(scores);
        System.out.println(result);
    }
}
