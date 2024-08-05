/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package math.Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/5
 */
public class Leet3143 {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] min1 = new int[26];
        Arrays.fill(min1, 1000000001);
        int min2 = 1000000001, n = s.length();
        for (int i = 0; i < n; ++i) {
            int x = points[i][0], y = points[i][1], j = s.charAt(i) - 'a';
            int d = Math.max(Math.abs(x), Math.abs(y));
            if (d < min1[j]) {
                min2 = Math.min(min2, min1[j]);
                min1[j] = d;
            } else if (d < min2) {
                min2 = d;
            }
        }
        int res = 0;
        for (int d : min1) {
            if (d < min2) {
                ++res;
            }
        }
        return res;
    }
}
