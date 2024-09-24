/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/24
 */
public class Leet2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[mat.length];
        int[] res = new int[2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1) arr[i]++;
            }
            if(res[1]<arr[i]){
                res[0] = i;
                res[1] = arr[i];
            }
        }
        return res;
    }
}
