package com.studyplan.topInterview150;

import java.util.Arrays;

/**
 * @author harry
 * @date 2023年11月14日 18:46
 */
public class interview19 {

    /**
     * 不建议使用Arrays.sort排序算法，增加时间复杂度
     * @param strs
     * @return
     */
    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        if (strs.length == 1) return strs[0];
        char[] startArray = strs[0].toCharArray();
        char[] endArray = strs[strs.length-1].toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < startArray.length; i++) {
           if (startArray[i] == endArray[i]) {
               sb.append(startArray[i]);
           }else {
               break;
           }
        }
        return sb.length() == 0 ? "" : sb.toString();
    }

    /**
     * 原生
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        //第一个元素
        char[] baseArray = strs[0].toCharArray();
        String result = "";
        //记录从第二个元素与第一个元素相比，最长公共串
        StringBuilder sb;
        int i=1;
        while(i<strs.length){
            char[] charArray = strs[i].toCharArray();
            sb = new StringBuilder();
            //对比第一个元素与数组的其他元素，获取最长公共串
            for (int j = 0; j < baseArray.length;j++){
                if (j <= charArray.length-1 && charArray[j]==baseArray[j]) {
                    sb.append(charArray[j]);
                }else {
                    break;
                }
            }
            if (sb.length() == 0) break;
            if (result.isEmpty()){
                result = sb.toString();
            }else {
                result = sb.toString().length() < result.length() ? sb.toString() : result;
            }
            i++;
        }
        return "";
    }



    public static void main(String[] args) {
        String[] scores = new String[]{"c", "acc","ccc"};
        String result = longestCommonPrefix(scores);
        System.out.println(result);
    }
}
