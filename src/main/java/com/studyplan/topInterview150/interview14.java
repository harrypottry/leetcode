package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author harry
 * @date 2023年11月10日 20:15
 * <a href="https://leetcode.cn/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview14 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        //把最大差值作为起点
        int index=0;
        //最大差值
        int max=Integer.MIN_VALUE;
        for(int i = gas.length-1;i>=0;i--){
            //循环内每走一步，计算当前差值
            sum+=gas[i]-cost[i];
            //将当前差值与最大值对比，拿到最大值，并记录下标
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        return sum>=0?index:-1;
    }

    public static void main(String[] args) {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }
}
