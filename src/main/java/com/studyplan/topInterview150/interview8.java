package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月05日 17:38
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview7 {

//    /**
//     * 时间复杂度 O（n）2，跑满量int[] 性能大幅度下降
//     * @param args
//     */
//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i =0;i<prices.length-1;i++) {
//            for (int j=i+1;j<prices.length;j++) {
//                int temp = prices[j] - prices[i];
//                max = Math.max(temp, max);
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }
}
