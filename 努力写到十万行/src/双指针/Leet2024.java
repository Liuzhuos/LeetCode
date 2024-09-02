/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/2
 */
public class Leet2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxString(answerKey,k,'T'),maxString(answerKey,k,'F'));
    }
    public static int maxString (String s ,int k, char t) {
        int left = 0 , right = 0;
        int res = 0 ,sum=0;
        for (;right < s.length();right++) {
            sum += s.charAt(right) != t  ?  1 : 0;
            while (sum>k){
                sum -= s.charAt(left++) != t ? 1 : 0;
            }
            res =  Math.max(res,right-left+1);
        }
        return res;
    }
}
