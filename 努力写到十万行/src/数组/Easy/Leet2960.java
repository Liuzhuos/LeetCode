/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/7/25
 */
public class Leet2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        int n = batteryPercentages.length;
        for (int i = 0; i < n; i++) {
            if(batteryPercentages[i]>0){
                res++;
                for (int j = i+1; j < n-1; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }
        return res;
    }
}
