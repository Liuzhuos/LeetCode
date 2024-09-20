/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/20
 */
public class Leet1446 {
    public int maxPower(String s) {
        int res = 1;
        int n = s.length();
        int k = 1;
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)) k++;
            else {
                res = Math.max(res,k);
                k=1;
            }
        }
        return Math.max(res,k);
    }
}
