/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/2
 */
public class Leet3128 {
    public long numberOfRightTriangles(int[][] grid) {
        int res = 0;
        int up = 0 ,down = 0 ,left = 0,right = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if(grid[i][j]==0) continue;
                up = 0;
                down = 0;
                left = 0 ;
                right = 0;
                for (int k = i + 1; k < grid.length; k++) {
                    if(grid[k][j] == 1) down++;
                }
                for (int k = j + 1; k < grid[0].length; k++) {
                    if (grid[i][k]==1) right++;
                }
                for (int k = 0; k < i; k++) {
                    if(grid[k][j] == 1) up++;
                }
                for (int k = 0; k < j; k++) {
                    if (grid[i][k]==1) left++;
                }
                res += (up*left) + (up*right) + (down * left) + (down * right );
            }
        }
        return res;
    }
}
