package com.studyplan.topInterview150;

/**
 * @author harry
 * @date 2023年11月15日 12:25
 * <a href="https://leetcode.cn/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview20 {

    public static String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] split = s.trim().split("\\s+");
        for (int i = split.length-1;i>=0;i--){
            if (i >0){
                sb.append(split[i] + " ");
            }else {
                sb.append(split[i]);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String testSrc = "  hello world  ";
        String result = reverseWords(testSrc);
        System.out.println(result);
    }
}
