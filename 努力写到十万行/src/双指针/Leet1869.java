/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/4
 */
public class Leet1869 {
    public boolean checkZeroOnes(String s){
        int len1 = 0, len0 = 0;
        int max1 = 0, max0 = 0;
        for (char c : s.toCharArray()) {
            if (c=='0') {
                len0++;
                len1=0;
            }else{
                len1++;
                len0=0;
            }
            max1=Math.max(len1,max1);
            max0=Math.max(len0,max0);
        }
        return max1>max0;
    }
}
