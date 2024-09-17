/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/17
 */
public class Leet3110 {
    public int scoreOfString(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n-1; i++) {
            int x = s.charAt(i)-s.charAt(i+1);
            x = x > 0 ? x : -1 * x ;
            res += x;
        }
        return res;
    }
}
