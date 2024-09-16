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
 * @date 2024/9/16
 */
public class Leet1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        boolean isOk = true;
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            if(target[i]!=arr[i]) {
                isOk = false;
                break;
            }
        }
        return isOk;
    }
}
