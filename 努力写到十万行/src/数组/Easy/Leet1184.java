/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/16
 */
public class Leet1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int start1 = Math.min(start,destination);
        int end1 = Math.max(start,destination);
        int sum = 0;
        int res = 0;
        int n = distance.length;
        for (int i = 0; i < n; i++) {
            if(i>=start1&&i<end1){
                res += distance[i];
            }
            sum += distance[i];
        }
        return Math.min(res,sum-res);
    }
}
