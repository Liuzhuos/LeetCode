/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Middle;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/23
 */
public class Leet1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0 , pmx = values[0] + 0 ;
        int n = values.length;
        for (int i = 0; i < n; i++) {
            res = Math.max(res,pmx + values[i]-i);
            pmx = Math.max(pmx,values[i]+i);
        }
        return res;
    }
}
