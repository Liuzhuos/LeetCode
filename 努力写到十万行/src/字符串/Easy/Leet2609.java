/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 字符串.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/8
 */
public class Leet2609 {
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int n = s.length();
        int[] count = new int[2];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count[1]++;
                res = Math.max(res, 2 * Math.min(count[0], count[1]));
            } else if (i == 0 || s.charAt(i - 1) == '1') {
                count[0] = 1;
                count[1] = 0;
            } else {
                count[0]++;
            }
        }
        return res;
    }
}
