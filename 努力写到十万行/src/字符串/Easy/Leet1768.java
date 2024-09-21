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
public class Leet1768 {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int k = 0, x = 0;
        int m = word2.length();
        String res = "";
        while (k < n && x < m) {
            res += word1.charAt(k++);
            res += word2.charAt(x++);
        }
        for (int i = k; i < n; i++) {
            res += word1.charAt(i);
        }
        for (int i = x; i < m; i++) {
            res += word2.charAt(i);
        }
        return res;
    }
}
