/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/8/21
 */
public class Leet1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        int n = startTime.length;
        for (int i = 0; i < n; i++) {
            if(queryTime>=startTime[i]&&queryTime<=endTime[i]){
                res++;
            }
        }
        return res;
    }
}
