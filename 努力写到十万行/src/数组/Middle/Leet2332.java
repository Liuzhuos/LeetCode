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
 * @date 2024/9/18
 */
public class Leet2332 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int m = 0;
        for (int i = 0; i < buses.length-1 ; i++) {
            for (int j = m; j < m + capacity; j++) {
                if(passengers[j]<=buses[i]){
                    m++;
                }
            }
        }
        return passengers[m]-1 ;
    }
}
