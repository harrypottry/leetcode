package com.studyplan.topInterview150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harry
 * @date 2023年11月12日 19:02
 * <a href="https://leetcode.cn/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150">罗马数字转整数</a>
 */
public class interview16 {

    static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = romanToInt("XXVII");
        System.out.println(result);
    }
}
