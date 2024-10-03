/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/3
 */
public class Leet2319 {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        boolean isOk=  true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j||i==n-j-1){
                    if(grid[i][j]==0){
                        isOk = false;
                        break;
                    }
                }else {
                    if(grid[i][j]!=0){
                        isOk = false;
                        break;
                    }
                }
            }
        }
        return isOk;
    }
}
