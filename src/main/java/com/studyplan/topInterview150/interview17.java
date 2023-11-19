package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月13日 20:53
 * <a href="https://leetcode.cn/problems/integer-to-roman/submissions/481874447/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview17 {

    static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        String result = intToRoman(123);
        System.out.println(result);
    }
}
