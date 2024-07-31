/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 贪心.Middle;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/31
 */
public class Leet3111 {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;
        int bound = -1;
        for(int[] p : points){
            if(p[0]>bound){
                bound = p[0]+ w;
                res++;
            }
        }
        return res;
    }
}
