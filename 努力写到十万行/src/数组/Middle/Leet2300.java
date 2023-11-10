/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2023/11/10
 */
public class Leet2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            long t = (success + spells[i] - 1) / spells[i] - 1;
            res[i] = m - binFind(potions, 0, m - 1, t);

        }
        return res;
    }
    public static int binFind(int[] arr,int left,int right, long tar){
        int res = right + 1 ;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>tar){
                res = mid;
                right = mid-1 ;
            }
            else {
                left = mid + 1;
            }
        }
        return res;
    }
}
