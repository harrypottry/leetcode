package com.studyplan.topInterview150;


/**
 * @author harry
 * @date 2023年11月14日 10:28
 */
public class interview18 {

    public static int lengthOfLastWord(String s) {
        int result = 0;
        String trim = s.trim();
        char[] charArray = trim.toCharArray();
        for (int i = charArray.length-1;i>=0;i--){
            char c = charArray[i];
            if (!Character.isSpaceChar(c)){
                result++;
            }else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = lengthOfLastWord(" hello world ");
        System.out.println(result);
    }
}
