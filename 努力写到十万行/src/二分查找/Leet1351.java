/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 二分查找;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/9
 */
public class Leet1351 {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int left = 0;
            int right = grid[0].length;
            while (left<right){
                int mid = left + (right-left)/2;
                if(grid[i][mid]<0){
                    right = mid ;
                }else {
                    left = mid +1;
                }
            }
            sum += grid[0].length -left;
        }
        return sum;
    }
}
