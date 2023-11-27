/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import javax.imageio.ImageIO;
import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/27
 */
public class Leet2500 {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = grid[0].length-1; i >=0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max,grid[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}
