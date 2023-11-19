package com.studyplan.topInterview150;

/**
 * @author harry
 * @date
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview8 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {  // 卖出有利可图
                ans += (prices[i] - prices[i-1]);
            }
        }

        return ans;
    }
}
