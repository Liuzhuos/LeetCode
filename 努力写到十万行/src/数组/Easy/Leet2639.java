/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/4/27
 */
public class Leet2639 {
    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        int max;
        for (int i = 0; i < res.length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                String s = grid[j][i]+"";
                max = Math.max(max,s.length());
            }
            res[i] = max;
        }
        return res;
    }
}
