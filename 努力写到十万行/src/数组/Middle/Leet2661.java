/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/12/1
 */
public class Leet2661 {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 0; i < n; i++) {//存储
            for (int j = 0; j < m; j++) {
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] rowCnt = new int[n];
        int[] colCnt = new int[m];
        for (int i = 0; i < arr.length; i++) {
            int[] v = map.get(arr[i]);
            rowCnt[v[0]]++;
            if(rowCnt[v[0]]==m) return i;
            colCnt[v[1]]++;
            if (colCnt[v[1]]==n) return i;
        }
        return -1;
    }
}
