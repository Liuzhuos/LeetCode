/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 数组.Easy;

import java.util.Arrays;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/17
 */
public class Leet1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean isOk = true;
        int d = arr[1] - arr[0];
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]+d!=arr[i+1]){
                isOk = false;
                break;
            }
        }
        return isOk;
    }
}
