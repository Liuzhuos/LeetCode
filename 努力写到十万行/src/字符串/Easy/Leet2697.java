/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/1/19
 */
public class Leet2697 {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            if (ch[i] != ch[n - i - 1]) {
                if ((ch[i] < ch[n - i - 1])) {
                    ch[n - i - 1] = ch[i];
                } else {
                    ch[i] = ch[n - i - 1];
                }
            }
        }
        return String.valueOf(ch);
    }
}
