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
 * @date 2024/1/18
 */
public class Leet2171 {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        Arrays.sort(beans);
        long res = Integer.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i <= beans[beans.length-1] ; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if(beans[j]<i) {
                    sum += beans[j];
                }else {
                    sum += (beans[j]- i);
                }
            }
            res = Math.min(res,sum);
        }
        return res;
    }
}
